package blanco.valueobject;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.tools.ToolProvider;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class GenerationTest {
    @Rule public TemporaryFolder temporary = new TemporaryFolder();

    @Test public void generatesAndCompilesJavaFromStandardDefinitions() throws Exception {
        Path directory = temporary.newFolder().toPath();
        for (String name : new String[]{"BlancoValueObjectSampleStructure", "BlancoValueObjectSample2Structure", "BlancoValueObjectSample3Structure"}) {
            Path xml = directory.resolve(name + ".xml");
            try (InputStream input = Files.newInputStream(Paths.get("meta/objects/" + name + ".xlsx"));
                    ByteArrayOutputStream output = new ByteArrayOutputStream()) {
                new BlancoValueObjectMeta2Xml().process(input, output);
                Files.write(xml, output.toByteArray());
            }
            assertTrue("Spreadsheet conversion must produce XML", Files.size(xml) > 0);
            BlancoValueObjectXml2JavaClass generator = new BlancoValueObjectXml2JavaClass();
            generator.setEncoding("UTF-8");
            generator.setTargetStyleAdvanced(true);
            generator.process(xml.toFile(), directory.resolve("generated").toFile());
        }
        List<String> arguments = new ArrayList<String>();
        arguments.add("--release"); arguments.add("8");
        arguments.add("-encoding"); arguments.add("UTF-8");
        arguments.add("-d"); arguments.add(directory.toString());
        try (Stream<Path> files = Files.walk(directory.resolve("generated"))) {
            files.filter(path -> path.toString().endsWith(".java")).forEach(path -> arguments.add(path.toString()));
        }
        assertTrue("Representative definition must generate Java", arguments.size() == 9);
        assertNotNull("Tests require a JDK", ToolProvider.getSystemJavaCompiler());
        assertEquals("Generated Java must compile", 0,
                ToolProvider.getSystemJavaCompiler().run(null, null, null, arguments.toArray(new String[0])));
    }
}
