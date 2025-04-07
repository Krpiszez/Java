package CompetetiveCoding;

import java.util.HashMap;
import java.util.Stack;

public class DepthFirstSearchExcercise {

    public static void main(String[] args) {
        DepthFirstSearchExcercise dfse = new DepthFirstSearchExcercise();

        dfse.depthFirstPrint(graph, 'a');
    }

    static HashMap<Character, char[]> graph = new HashMap<>();

    static {
        graph.put('a', new char[]{'b', 'c'});
        graph.put('b', new char[]{'d'});
        graph.put('c', new char[]{'e'});
        graph.put('d', new char[]{'f'});
        graph.put('e', new char[]{});
        graph.put('f', new char[]{});
    }


    public void depthFirstPrint(HashMap<Character, char[]> graph, char ch) {

        Stack<Character> stack = new Stack<>();
        stack.push(ch);

        while (!stack.isEmpty()) {

            char currentChar = stack.pop();
            System.out.println(currentChar);

            for (char c : graph.get(currentChar)) {
                stack.push(c);
            }

        }

    }
}
