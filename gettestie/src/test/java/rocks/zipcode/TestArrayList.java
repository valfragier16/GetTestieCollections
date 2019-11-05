package rocks.zipcode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    private ArrayList<String> array;

    @org.junit.Before
    public void setUp() throws Exception {
        array = new ArrayList<>();
        array.add("Hello world");
        array.add("Valerie");
        array.add("Aspiring Software Developer");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @org.junit.Test
    public void TestArrayListGetIndex() {
        assertEquals("Valerie", array.get(1));
    }

    @Test
    public void TestArrayListContains() {
        assertEquals(true, array.contains("Valerie"));
    }

    @Test
    public void TestArrayListSubList() {
        List<String> arrlist2 = array.subList(1, 2);
        assertEquals(array.get(1), arrlist2.get(0));
    }

    @Test
    public void TestArrayListRemoveO() {
        assertEquals(true, array.remove("Valerie"));
        System.out.print(array); // displays [Hello world, Aspiring Software Developer]
    }

    @Test
    public void TestArrayListAddAll() {
        ArrayList<String> arrlist2 = new ArrayList<String>();
        arrlist2.add("Work Hard");
        arrlist2.add("Smile More");
        arrlist2.add("Worry Less");
        assertEquals(true, array.addAll(arrlist2));
        System.out.print(array); // displays [Hello world, Valerie, Aspiring Software Developer, Work Hard, Smile More, Worry Less]
    }
    @Test
    public void TestArrayListReverse() {
        Collections.reverse(array);
        assertEquals(array.subList(0,3), array);
        System.out.print(array); // displays [Aspiring Software Developer, Valerie, Hello world]
    }
}
