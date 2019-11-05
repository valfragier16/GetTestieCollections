package rocks.zipcode;


import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class TestTreeMap {
    TreeMap<String, Integer> treeM;

    @org.junit.Before
    public void setUp() throws Exception {
        treeM = new TreeMap<>();
        treeM.put("A",1);
        treeM.put("B",2);
        treeM.put("C",3);
        treeM.put("D",4);
        treeM.put("E",5);

    }
    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void TestTreeMapSize() {
        assertEquals(5, treeM.size());
    }

    @Test
    public void TestTreeMapContainsKey() {
        assertTrue(treeM.containsKey("A"));
    }

    @Test
    public void TestTreeMapContainsValue() {
        assertFalse(treeM.containsValue(6));
    }

    @Test
    public void TestTreeMapFloorKey() {
        assertEquals("E",treeM.floorKey("E"));
    }
    @Test
    public void TestTreeMapClear() {
        treeM.clear();
        assertEquals(true, treeM.isEmpty());
    }
}
