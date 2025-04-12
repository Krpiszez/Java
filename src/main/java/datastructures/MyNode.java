package datastructures;

public class MyNode<T> {

    T val;

    MyNode next;

    public MyNode(T val) {
        this.val = val;
    }


    public static void main(String[] args) {
        MyNode head = new MyNode("A");
        MyNode node1 = new MyNode("B");
        MyNode node2 = new MyNode("C");
        MyNode node3 = new MyNode("D");
        MyNode node4 = new MyNode("E");

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printLinkedList(head);
        printLinkedListRecursive(head);
    }

    private static void printLinkedList(MyNode head) {
        MyNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    private static void printLinkedListRecursive(MyNode head) {
        if (head == null) return;
        System.out.println(head.val);
        printLinkedListRecursive(head.next);

    }
}
