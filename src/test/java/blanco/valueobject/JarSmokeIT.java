package blanco.valueobject;

import static org.junit.Assert.*;

import java.io.DataInputStream;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import javax.tools.ToolProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/** Runs after packaging, with project classes and resources loaded only from the release JAR. */
public class JarSmokeIT {
    @Rule public TemporaryFolder temporary = new TemporaryFolder();

    @Test public void packagedJarGeneratesCompilableJava() throws Exception {
        Path jar = Paths.get(System.getProperty("release.jar")).toAbsolutePath();
        List<URL> urls = new ArrayList<URL>();
        urls.add(jar.toUri().toURL());
        String classpath = System.getProperty("surefire.test.class.path", System.getProperty("java.class.path"));
        for (String entry : classpath.split(File.pathSeparator)) {
            // The bootstrap ValueObject artifact must not mask missing release classes/resources.
            String name = new File(entry).getName();
            boolean bootstrap = false;
            for (String artifact : new String[]{"blanco-anttask", "blanco-batchprocess", "blanco-valueobject",
                    "blanco-constants", "blanco-message", "blanco-meta2xml", "blanco-resourcebundle"}) {
                if (name.startsWith(artifact + "-")) bootstrap = true;
            }
            if (entry.endsWith(".jar") && !bootstrap) urls.add(new File(entry).toURI().toURL());
        }
        try (URLClassLoader loader = new URLClassLoader(urls.toArray(new URL[0]),
                ClassLoader.getSystemClassLoader().getParent())) {
            for (String resource : new String[]{"blanco/valueobject/BlancoValueObjectMeta2Xml.xml",
                    "blanco/valueobject/resourcebundle/BlancoValueObject.properties",
                    "blanco/valueobject/resourcebundle/BlancoValueObject_ja.properties"}) {
                URL location = loader.getResource(resource);
                assertNotNull("Packaged resource: " + resource, location);
                assertTrue(location.toString(), location.toString().startsWith("jar:" + jar.toUri().toURL() + "!/"));
            }
            Path directory = temporary.newFolder().toPath();
            Path metadata = Files.createDirectory(directory.resolve("meta"));
            for (String name : new String[]{"BlancoValueObjectSampleStructure", "BlancoValueObjectSample2Structure", "BlancoValueObjectSample3Structure"}) {
                Files.copy(Paths.get("meta/objects/" + name + ".xlsx"), metadata.resolve(name + ".xlsx"));
            }
            Class<?> inputType = loader.loadClass("blanco.valueobject.task.valueobject.BlancoValueObjectProcessInput");
            Object input = inputType.getDeclaredConstructor().newInstance();
            String[][] properties = {{"Metadir", metadata.toString()},
                    {"Tmpdir", directory.resolve("xml").toString()},
                    {"Targetdir", directory.resolve("generated").toString()},
                    {"TargetStyle", "free"}, {"SheetType", "java"}, {"Encoding", "UTF-8"}};
            for (String[] property : properties) inputType.getMethod("set" + property[0], String.class).invoke(input, property[1]);
            assertEquals(System.getProperty("release.version"), loader.loadClass(
                    "blanco.valueobject.BlancoValueObjectConstants").getField("VERSION").get(null));
            Class<?> processType = loader.loadClass("blanco.valueobject.task.BlancoValueObjectProcessImpl");
            assertEquals(jar.toUri().toURL(), processType.getProtectionDomain().getCodeSource().getLocation());
            Object process = processType.getDeclaredConstructor().newInstance();
            assertEquals(0, processType.getMethod("execute", inputType).invoke(process, input));
            List<String> arguments = new ArrayList<String>();
            arguments.add("--release"); arguments.add("8");
            arguments.add("-encoding"); arguments.add("UTF-8");
            arguments.add("-d"); arguments.add(directory.toString());
            try (Stream<Path> files = Files.walk(directory.resolve("generated"))) {
                files.filter(path -> path.toString().endsWith(".java")).forEach(path -> arguments.add(path.toString()));
            }
            assertTrue("JAR must generate Java", arguments.size() == 9);
            assertEquals(0, ToolProvider.getSystemJavaCompiler().run(null, null, null, arguments.toArray(new String[0])));
        }
    }

    @Test public void allProductionClassesUseJava8Bytecode() throws Exception {
        int count = 0;
        try (JarFile jar = new JarFile(System.getProperty("release.jar"))) {
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (!entry.getName().endsWith(".class")) continue;
                try (DataInputStream input = new DataInputStream(jar.getInputStream(entry))) {
                    assertEquals(0xCAFEBABE, input.readInt()); input.readUnsignedShort();
                    assertEquals(entry.getName(), 52, input.readUnsignedShort()); count++;
                }
            }
        }
        assertTrue("Release must contain production classes", count > 0);
    }

    @Test public void sourcesJarIncludesHandwrittenAndGeneratedSources() throws Exception {
        try (JarFile jar = new JarFile(System.getProperty("sources.jar"))) {
            assertNotNull(jar.getEntry("blanco/valueobject/BlancoValueObjectXml2JavaClass.java"));
            assertNotNull(jar.getEntry("blanco/valueobject/valueobject/BlancoValueObjectClassStructure.java"));
        }
    }
}
