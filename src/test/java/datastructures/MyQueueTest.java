package datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void shouldDequeWhenQueueHasValues() {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(4);
        assertEquals(queue.getSize(), 3);
        assertEquals(queue.dequeue(), 7);
        assertEquals(queue.getSize(), 2);
        assertEquals(queue.dequeue(), 8);
        assertEquals(queue.dequeue(), 4);
    }

    @Test
    void shouldEnqueueToQueue() {
        MyQueue queue = new MyQueue(3);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(6);
        assertEquals(6, queue.peek());
        queue.dequeue();
        assertEquals(8, queue.peek());
    }



}