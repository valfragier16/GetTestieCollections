package rocks.zipcode;

import org.junit.Test;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class TestVector {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVectorAdd() {
        Vector v = new Vector();
        v.add("Hello world");
        v.add("Yuki");
        v.add("Akita bear");
        assertEquals(true, v.contains("Yuki"));
    }
    @Test
    public void TestVectorAdd2() {
        Vector v = new Vector();
        v.add("Hello world");
        v.add("Yuki");
        v.add("Akita bear");
        assertEquals(false, v.equals("Justin"));
    }

    @Test
    public void TestVectorVoid() {
        Vector v = new Vector();
        v.add("Hello world");
        v.add("Yuki");
        v.add("Akita bear");
        v.clear();
        assertEquals(true, v.isEmpty());
    }

    @Test
    public void TestVectorClone(){
        Vector v = new Vector();
        Vector v_clone = new Vector();
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);
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
