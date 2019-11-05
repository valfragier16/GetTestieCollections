package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
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
        Stack<String> stack = new Stack<>(); // new empty stack
        stack.push("Hello world"); // add to stack
        stack.pop(); // remove string from stack
        assertEquals(true, stack.isEmpty());
        // Throws EmptyStackException - if this stack is empty.
    }

    @Test
    public void TestStackPop2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Valerie");
        stack.push("Aspiring Software Developer");
        stack.pop(); // remove string from stack
        assertEquals(false, stack.isEmpty()); // true - stack not empty
        System.out.print(stack); // Will display [Hello world, Valerie] the last element in the stack is removed thus the stack is not empty
    }

    @Test
    public void TestStackPeek() { // Looks at the object on top without removing it
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Valerie");
        stack.push("Aspiring Software Developer"); // LIFO
        stack.peek();
        assertEquals("Aspiring Software Developer", stack.peek());
    }

    @Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        assertEquals(true, stack.isEmpty()); // true
    }

    @Test
    public void TestStackSearch() { // returns the 1-based position from the top of the stack where the object is located.
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("Valerie");
        stack.push("Aspiring Software Developer");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertEquals(5, stack.search("Valerie"));
    }



}
