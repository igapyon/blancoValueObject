package blanco.valueobject;

import static org.junit.Assert.*;

import blanco.valueobject.valueobject.BlancoValueObjectClassStructure;
import blanco.valueobject.valueobject.BlancoValueObjectFieldStructure;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class CopyToTest {
    @Test public void classListsRetainElementsAndAreIndependent() {
        BlancoValueObjectClassStructure original = new BlancoValueObjectClassStructure();
        BlancoValueObjectClassStructure copy = new BlancoValueObjectClassStructure();
        List<List<String>> originals = Arrays.asList(original.getDescriptionList(),
                original.getAnnotationList(), original.getImportList(), original.getImplementsList());
        List<List<String>> copies = Arrays.asList(copy.getDescriptionList(),
                copy.getAnnotationList(), copy.getImportList(), copy.getImplementsList());
        for (List<String> list : originals) list.addAll(Arrays.asList("first", null, "last"));
        original.copyTo(copy);
        assertIndependent(originals, copies);
    }

    @Test public void fieldListsRetainElementsAndAreIndependent() {
        BlancoValueObjectFieldStructure original = new BlancoValueObjectFieldStructure();
        BlancoValueObjectFieldStructure copy = new BlancoValueObjectFieldStructure();
        List<List<String>> originals = Arrays.asList(original.getDescriptionList(), original.getAnnotationList());
        List<List<String>> copies = Arrays.asList(copy.getDescriptionList(), copy.getAnnotationList());
        for (List<String> list : originals) list.addAll(Arrays.asList("first", null, "last"));
        original.copyTo(copy);
        assertIndependent(originals, copies);
    }

    @Test public void nullSourceListsDoNotEraseTargetLists() {
        BlancoValueObjectFieldStructure original = new BlancoValueObjectFieldStructure();
        BlancoValueObjectFieldStructure copy = new BlancoValueObjectFieldStructure();
        original.setDescriptionList(null);
        original.setAnnotationList(null);
        copy.getDescriptionList().add("existing");
        original.copyTo(copy);
        assertEquals(Arrays.asList("existing"), copy.getDescriptionList());
        assertTrue(copy.getAnnotationList().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullTargetIsRejected() {
        new BlancoValueObjectClassStructure().copyTo(null);
    }

    private static void assertIndependent(List<List<String>> originals, List<List<String>> copies) {
        for (int i = 0; i < originals.size(); i++) {
            assertEquals(originals.get(i), copies.get(i));
            assertNotSame(originals.get(i), copies.get(i));
            copies.get(i).add("copy only");
            assertEquals(Arrays.asList("first", null, "last"), originals.get(i));
        }
    }
}
