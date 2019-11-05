package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestPriorityQueue {
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
    public void TestPriorityQueueOffer(){ //Inserts the specified element into this priority queue.
        assertTrue(list.offer("F"));
    }

    @Test
    public void TestPriorityQueuePeek() {
        assertEquals("A",list.peek());
    }
    @Test
    public void TestPriorityQueueContains() {
        assertTrue(list.contains("B"));
    }
    @Test
    public void TestPriorityQueueSize() {
        assertEquals(5,list.size());
    }

    @Test
    public void TestPriorityQueuePollLast() {
        assertEquals("E",list.pollLast());
    }
}
