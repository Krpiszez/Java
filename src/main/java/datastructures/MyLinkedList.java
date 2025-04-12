package datastructures;

public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    private static class Node<T> {

        T val;

        Node<T> next;

        public Node() {
        }

        public Node(T val) {
            this.val = val;
        }

        public Node(T val, Node<T> next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public static void main(String[] args) {
        linkListValues();
    }

    private static void linkListValues() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");

        Node<String> curr = myLinkedList.head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
