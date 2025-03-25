package datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void canAddValuesToStack() {
        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        assertEquals(9, stack.peek());
        assertEquals(3, stack.getSize());

    }

    @Test
    void canRemoveValuesFromStack() {
        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        assertEquals(9, stack.pop());
        assertEquals(2, stack.getSize());

    }

    @Test
    void canPeekValuesToStack() {
        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        assertEquals(9, stack.peek());
        assertEquals(3, stack.getSize());
    }

}