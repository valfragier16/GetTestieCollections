package rocks.zipcode;

import org.junit.Test;

import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestTreeSet {
    TreeSet<String> ts1 = new TreeSet<String>();

    @org.junit.Before
    public void setUp() throws Exception {
        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");

        // Duplicates will not get insert
        ts1.add("C");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestTreeSetEmpty() {
        assertFalse(ts1.isEmpty());
    }
    @Test
    public void TestTreeSetSize() {
        assertEquals(3,ts1.size());
    }
    @Test
    public void TestTreeSetDescendingSet() {
        NavigableSet<String> treereverse = ts1.descendingSet();
        assertEquals(ts1, treereverse);
    }
    @Test
    public void TestTreeSetLast() {
        assertEquals("C",ts1.last());
    }
    @Test
    public void TestTreeSetPollFirst() {
        assertEquals("A",ts1.pollFirst());
    }
}
