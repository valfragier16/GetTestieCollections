package rocks.zipcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestHashSet {
    HashSet<String> set = new HashSet<String>();

    @org.junit.Before
    public void setUp() throws Exception {
        set.add("Welcome");
        set.add("To");
        set.add("Zipcode");
        set.add("Wilmington");
        set.add("Cohort 5.2");
    }
    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestHashSetRemove() {
        assertTrue(set.remove("To"));
    }

    @Test
    public void TestHashSetSize() {
        assertEquals(5, set.size());
    }

    @Test
    public void TestHashSetEmpty() {
        assertFalse(set.isEmpty());
    }

    @Test
    public void TestHashSetContains() {
        assertTrue(set.contains("Wilmington"));
    }
    @Test
    public void TestHashSetEquals() {
        HashSet<String> set2 = new HashSet<String>();
            set2.add("Welcome");
            set2.add("To");
            set2.add("Zipcode");
            set2.add("Wilmington");
            set2.add("Cohort 5.2");
        assertTrue(set.equals(set2));
    }
}
