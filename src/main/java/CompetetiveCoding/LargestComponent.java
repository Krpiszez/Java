package CompetetiveCoding;

import java.util.*;

public class LargestComponent {

    public static void main(String[] args) {

        HashMap<Integer, List<Integer>> graph = new HashMap<>(Map.of(
                0, List.of(8, 1, 5),
                1, List.of(0),
                5, List.of(0, 8),
                8, List.of(0, 5),
                2, List.of(3, 4),
                3, List.of(2, 4),
                4, List.of(3, 2)
        ));
        Set<Integer> visited = new HashSet<>();

        System.out.println(largestComponent(graph, visited));
        visited.clear();
        System.out.println(largestComponentRecursive(graph, visited));

    }

    public static int largestComponent(Map<Integer, List<Integer>> graph, Set<Integer> visited) {

        int max = 0;
        for (int node : graph.keySet()) {
            int curr = explore(graph, node, visited);
            max = Math.max(max, curr);
        }

        return max;

    }

    private static int explore(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {

        if (visited.contains(node)) return 0;
        int size = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (visited.contains(curr)) continue;
            visited.add(curr);
            size++;

            for (int neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        return size;

    }

    public static int largestComponentRecursive(Map<Integer, List<Integer>> graph, Set<Integer> visited) {

        int max = 0;
        for (int node : graph.keySet()) {
            int curr = exploreRecursive(graph, node, visited);
            max = Math.max(max, curr);
        }

        return max;

    }

    private static int exploreRecursive(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {

        if (visited.contains(node)) return 0;
        int size = 1;
        visited.add(node);

        for (int neighbor : graph.get(node)) {
            size += exploreRecursive(graph, neighbor, visited);
        }

        return size;


    }

}
