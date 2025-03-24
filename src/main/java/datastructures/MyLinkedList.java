package datastructures;

import java.util.LinkedList;

public class MyLinkedList {

    Node first;
    Node last;
    int size;

    public void addFirst(int val) {
        final Node f = first;
        final Node newNode = new Node(val, null, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.left = newNode;
        size++;
    }

    public void addLast(int val) {
        final Node f = last;
        final Node newNode = new Node(val, f, null);
        last = newNode;
        if (f == null)
            first = newNode;
        else
            f.right = newNode;
        size++;
    }


    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(4);
        list.addLast(6);
        list.addFirst(8);

        System.out.println(list.first.val);
        System.out.println(list.first.right.val);
        System.out.println(list.first.right.right.val);

    }
}
