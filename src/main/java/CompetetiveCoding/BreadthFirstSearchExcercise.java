package CompetetiveCoding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstSearchExcercise {

    public static void main(String[] args) {
        BreadthFirstSearchExcercise dfse = new BreadthFirstSearchExcercise();

        dfse.breadthFirstPrint(graph, 'a');
        dfse.breadthFirstPrintRecursive(graph, 'a');
    }

    static HashMap<Character, char[]> graph = new HashMap<>();

    static {
        graph.put('a', new char[]{'c', 'b'});
        graph.put('b', new char[]{'d'});
        graph.put('c', new char[]{'e'});
        graph.put('d', new char[]{'f'});
        graph.put('e', new char[]{});
        graph.put('f', new char[]{});
    }


    public void breadthFirstPrint(HashMap<Character, char[]> graph, char ch) {

        Queue<Character> queue = new LinkedList<>();
        queue.offer(ch);

        while (!queue.isEmpty()) {
            char curr = queue.poll();
            System.out.println(curr);

            for (char neighbor : graph.get(curr)) {
                queue.offer(neighbor);
            }
        }

    }

    public void breadthFirstPrintRecursive(HashMap<Character, char[]> graph, char ch) {

        System.out.println(ch);

        for (char neighbor : graph.get(ch)) {
            breadthFirstPrintRecursive(graph, neighbor);
        }

    }
}
