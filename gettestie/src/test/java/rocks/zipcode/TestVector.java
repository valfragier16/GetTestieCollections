package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestVector {
    private Vector v;
    private Vector v_clone;

    @org.junit.Before
    public void setUp() throws Exception {
        v = new Vector();
        v_clone = new Vector();
        v.add("Hello world");
        v.add("Yuki");
        v.add("Akita bear");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVectorAdd() {
        v.add("Yami");
        assertTrue(v.contains("Yami"));
    }

    @Test
    public void TestVectorVoid() {
        v.clear();
        assertTrue(v.isEmpty());
    }

    @Test
    public void TestVectorClone(){
        v_clone = (Vector)v.clone();
        assertEquals(true, v.equals(v_clone)); // a clone of v versus v clone
    }

    @Test
    public void TestVectorGet(){
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);
        assertEquals("Geeks", v.get(2));
    }
    @Test
    public void TestVectorLastIndex(){ // Returns the index of the last occurrence of the specified element in this vector, or -1 if this vector does not contain the element.
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);
        assertEquals(2, v.lastIndexOf(2));
    }

}
