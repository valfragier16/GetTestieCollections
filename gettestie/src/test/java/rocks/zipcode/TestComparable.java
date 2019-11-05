package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestComparable {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestComparable() {
        String s1 = "ZipCode";
        String s2 = "Wilmington";
        assertEquals(3, s1.compareTo(s2));
        assertTrue(s1.compareTo(s2) > 0);
        System.out.print(s1.compareTo(s2));
    }

}
