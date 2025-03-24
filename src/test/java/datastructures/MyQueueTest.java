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
        assertEquals(queue.dequeue(), 7);
        assertEquals(queue.dequeue(), 8);
        assertEquals(queue.dequeue(), 4);
    }

}