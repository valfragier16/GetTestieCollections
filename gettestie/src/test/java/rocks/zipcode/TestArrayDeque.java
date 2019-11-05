package rocks.zipcode;


import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {
    public Deque<String> de_que;

    @org.junit.Before
    public void setUp() throws Exception {
        de_que = new ArrayDeque<String>();
        de_que.add("Hi");
        de_que.add("Val");
        de_que.add("You're");
        de_que.add("Amazing");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestArrayDequeEmpty() {
        assertEquals(false, de_que.isEmpty());
    }
    @Test
    public void TestArrayDequeRemoveLastOcc(){
        Deque<String> de_que = new ArrayDeque<String>();
        de_que.add("Welcome");
        de_que.add("To");
        de_que.add("Geeks");
        de_que.add("For");
        de_que.add("Geeks");
        de_que.removeLastOccurrence("Geeks");
        de_que.removeLastOccurrence("For");
        Deque<String> result = de_que;
        assertEquals(de_que, result);
    }

    @Test
    public void TestArrayDequePeekFirst() {
        assertEquals("Hi", de_que.peekFirst());
    }

    @Test
    public void TestArrayDequeElement() {
        assertEquals("Hi", de_que.element());
    }

    @Test
    public void TestArrayDequeSize() {
        assertEquals(4, de_que.size());
    }




}
