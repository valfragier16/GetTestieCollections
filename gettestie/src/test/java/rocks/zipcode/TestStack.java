package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    private Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Valerie");
        stack.push("Aspiring Software Developer"); // LIFO
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStackPop() { // removes object from top of stack
        stack.pop(); // remove string from stack
        assertEquals(false, stack.isEmpty());
        // Throws EmptyStackException - if this stack is empty.
    }


    @Test
    public void TestStackPeek() { // Looks at the object on top without removing it
        assertEquals("Aspiring Software Developer", stack.peek());
    }

    @Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        assertEquals(true, stack.isEmpty()); // true
    }

    @Test
    public void TestStackSearch() { // returns the 1-based position from the top of the stack where the object is located.
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertEquals(5, stack.search("Valerie"));
    }



}
