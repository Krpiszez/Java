package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyNode<T> {

    T val;

    MyNode<T> next;

    public MyNode(T val) {
        this.val = val;
    }


    public static void main(String[] args) {
        MyNode<String> head = new MyNode<>("A");
        MyNode<String> node1 = new MyNode<>("B");
        MyNode<String> node2 = new MyNode<>("C");
        MyNode<String> node3 = new MyNode<>("D");
        MyNode<String> node4 = new MyNode<>("E");

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printLinkedList(head);
        printLinkedListRecursive(head);
        System.out.println(linkedListValues(head));
        System.out.println(linkedListValuesRecursive(head));
    }

    public static List<String> linkedListValuesRecursive(MyNode<String> head) {
        List<String> result = new ArrayList<>();
        collectValuesRecursively(head, result);
        return result;
    }

    private static void collectValuesRecursively(MyNode<String> node, List<String> result) {
        if (node == null) return;
        result.add(node.val);
        collectValuesRecursively(node.next, result);
    }

    private static void printLinkedList(MyNode<String> head) {
        MyNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    private static void printLinkedListRecursive(MyNode<String> head) {
        if (head == null) return;
        System.out.println(head.val);
        printLinkedListRecursive(head.next);

    }

    public static List<String> linkedListValues(MyNode<String> head) {
        List<String> returnList = new ArrayList<>();

        MyNode<String> curr = head;
        while (curr != null) {
            returnList.add(curr.val);
            curr = curr.next;
        }
        return returnList;
    }
}
