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

        MyNode<Integer> a = new MyNode<>(2);
        MyNode<Integer> b = new MyNode<>(38);
        MyNode<Integer> c = new MyNode<>(3);
        MyNode<Integer> d = new MyNode<>(-1);
        MyNode<Integer> e = new MyNode<>(7);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        printLinkedList(head);
        printLinkedListRecursive(head);
        System.out.println(linkedListValues(head));
        System.out.println(linkedListValuesRecursive(head));

        System.out.println(sumList(a));
        System.out.println(sumListRec(a));
        System.out.println(sumListRecursive(a));

        System.out.println(linkedListFind(a, 383));
        System.out.println(linkedListFindRecursive(a, 383));
        System.out.println(linkedListFind(head, "Ce"));
        System.out.println(linkedListFindRecursive(head, "Ce"));
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
        MyNode<String> current = head;
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

    public static int sumList(MyNode<Integer> head) {
        int sum = 0;

        MyNode<Integer> current = head;
        while (current != null) {
            sum += current.val;
            current = current.next;
        }

        return sum;
    }

    private static int sumListRecursive(MyNode<Integer> head) {
        if (head == null) return 0;
        return head.val + sumListRecursive(head.next);
    }

    public static int sumListRec(MyNode<Integer> head) {
        int sum = 0;
        sum += sumRec(head, sum);
        return sum;
    }

    private static int sumRec(MyNode<Integer> next, int sum) {
        if (next == null) return sum;
        sum += next.val;
        return sumRec(next.next, sum);
    }

    public static <T> boolean linkedListFind(MyNode<T> head, T target) {

        MyNode<T> current = head;
        while (current != null) {
            if (current.val.equals(target)) return true;
            current = current.next;
        }

        return false;
    }

    public static <T> boolean linkedListFindRecursive(MyNode<T> head, T target) {

        if (head == null) return false;
        if (head.val.equals(target)) return true;
        return linkedListFindRecursive(head.next, target);
    }
}
