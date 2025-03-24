package datastructures;

public class MyQueue {

    private int[] array;
    private int size;
    private int maxSize;
    private int front;
    private int rear;

    public int getSize() {
        return size;
    }

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
    }

    public void enqueue(int i) {
        if (rear >= maxSize) {
            return;
        }
        rear = (rear + 1) % maxSize;
        array[rear] = i;
        size++;
    }

    public Integer dequeue() {
        size--;
        front = (front + 1) % maxSize;
        return array[front];
    }

    public Integer peek() {
        return array[front];
    }
}
