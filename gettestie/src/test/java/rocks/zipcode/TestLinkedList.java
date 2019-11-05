package rocks.zipcode;

import org.junit.Test;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TestLinkedList {
    LinkedList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @Test
    public void TestLinkedListGetLast() {
        assertEquals("E", list.getLast());
    }
    @Test
    public void TestLinkedListClear() {
        assertTrue(list.contains("D"));
    }
    @Test
    public void TestLinkedListSet() {
        assertEquals("A", list.set(0,"1"));
        System.out.print(list); // Displays [1, B, C, D, E]
    }
    @Test
    public void TestLinkedListPeek() { // Retrieves, but does not remove, the head (first element) of this list.
        assertEquals("A",list.peek());
    }
    @Test
    public void TestLinkedListPoll() { // Retrieves and removes the head (first element) of this list.
        assertEquals("A",list.poll());
    }
}
