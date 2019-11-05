package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class TestIterator {
    ArrayList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
       list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIteratorContains() {
        assertFalse(list.contains("X"));
    }

    @Test
    public void TestIteratorGet(){
        assertEquals("B",list.get(1));
    }

    @Test
    public void TestIteratorHasPrevious() {
        ListIterator iterator = list.listIterator();
        assertFalse(iterator.hasPrevious());
    }

    @Test
    public void TestIteratorRemove() {
        assertTrue(list.remove("C"));
    }
    @Test
    public void TestIteratorRemove2() {
        assertFalse(list.remove("F"));
    }
}
