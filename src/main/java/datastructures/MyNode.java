package datastructures;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class MyNode<T> {

    T val;

    MyNode<T> next;

    public MyNode(T val) {
        this.val = val;
    }


    public static void main(String[] args) {

        MyNode<String> zipperA = new MyNode<>("A");
        MyNode<String> zipperB = new MyNode<>("B");
        MyNode<String> zipperC = new MyNode<>("C");

        zipperA.next = zipperB;
        zipperB.next = zipperC;

        MyNode<String> zipperQ = new MyNode<>("Q");
        MyNode<String> zipperX = new MyNode<>("X");
        MyNode<String> zipperY = new MyNode<>("Y");
        MyNode<String> zipperZ = new MyNode<>("Z");

        zipperQ.next = zipperX;
        zipperX.next = zipperY;
        zipperY.next = zipperZ;

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
        System.out.println(linkedListFind(head, "C"));
        System.out.println(linkedListFindRecursive(head, "C"));

        System.out.println(getNodeValue(head, 6));
        System.out.println(getNodeValueRecursive(head, 6));

        System.out.println(reverseList(head).val);
        System.out.println(reverseListRecursive(head).val);

        System.out.println("Zipper: ");
        printLinkedList(zipperLists(zipperA, zipperQ));
        System.out.println("Zipper Recursive: ");
//        printLinkedList(zipperListsRecursive(zipperA, zipperQ));
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
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
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

    public static <T> T getNodeValue(MyNode<T> head, int index) {
        MyNode<T> current = head;
        int count = 0;

        while (current != null) {
            if (count == index) return current.val;
            current = current.next;
            count++;
        }

        return null;
    }

    public static <T> T getNodeValueRecursive(MyNode<T> head, int index) {
        if (index == 0) return head.val;
        if (index < 0 || head == null) return null;
        return getNodeValueRecursive(head.next, index - 1);
    }

    public static <T> MyNode<T> reverseList(MyNode<T> head) {
        MyNode<T> current = head;
        MyNode<T> prev = null;

        while (current != null) {
            MyNode<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static <T> MyNode<T> reverseListRecursive(MyNode<T> head) {
        if (head == null || head.next == null) return head;
        MyNode<T> newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static <T> MyNode<T> zipperLists(MyNode<T> head1, MyNode<T> head2) {
        MyNode<T> tail = head1;
        MyNode<T> current1 = head1.next;
        MyNode<T> current2 = head2;
        int count = 0;


        while (current1 != null && current2 != null) {
            if (count % 2 == 0) {
                tail.next = current2;
                current2 = current2.next;
            } else {
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            count++;
        }

        tail.next = (current1 != null) ? current1 : current2;
        return head1;
    }

    public static <T> MyNode<T> zipperListsRecursive(MyNode<T> head1, MyNode<T> head2) {
        if (head1 == null && head2 == null) return null;
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        MyNode<T> next1 = head1.next;
        MyNode<T> next2 = head2.next;
        head1.next = head2;
        head2.next = zipperListsRecursive(next1, next2);
        return head1;
    }
}
