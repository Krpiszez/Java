package datastructures;

import java.util.Stack;

public class MyStack<T> {

    private int size;
    private int maxSize;
    private int pointer;
    private T[] arr;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.pointer = -1;
        this.arr = (T[]) new Object[maxSize];
    }

    public void push(T t) {
        size++;
        arr[++pointer] = t;
    }

    public T peek() {
        return arr[pointer];
    }

    public int getSize() {
        return this.size;
    }

    public T pop() {
        size--;
        return arr[pointer--];
    }
}
