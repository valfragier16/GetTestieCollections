package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {
    HashMap<String, String> Map;

    @org.junit.Before
    public void setUp() throws Exception {
        Map = new HashMap<>();
        // Adding values to HashMap as ("keys", "values")
        Map.put("Language", "Java");
        Map.put("Platform", "Geeks For geeks");
        Map.put("Code", "HashMap");
        Map.put("Learn", "More");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMapContainsKey() {
        assertTrue( Map.containsKey("Language"));
    }

    @Test
    public void TestHashMapEmpty() {
        assertFalse(Map.isEmpty());
    }
    @Test
    public void TestHashMapRemove() {
        assertTrue(Map.remove("Code", "HashMap"));
    }

    @Test
    public void TestHashMapClear() {
        Map.clear();
        assertEquals(true, Map.isEmpty());
    }

    @Test
    public void TestHashMapReplace() {
        assertEquals("Geeks For geeks", Map.replace("Platform" ,"IntelliJ"));
    }


}
