package CompetetiveCoding;

import java.util.*;

public class ConnectedComponentsCount {

    public static void main(String[] args) {



        HashMap<Integer, List<Integer>> graph = new HashMap<>(Map.of(
                3, List.of(),
                4, List.of(6),
                6, List.of(4, 5, 7, 8),
                8, List.of(6),
                7, List.of(6),
                5, List.of(6),
                1, List.of(2),
                2, List.of(1)
        ));
        Set<Integer> visited = new HashSet<>();

        System.out.println(countConnectedComponents(graph, visited));
        visited.clear();
        System.out.println(countConnectedComponentsBFS(graph, visited));
        visited.clear();
        System.out.println(countConnectedComponentsRecursive(graph, visited));

    }

    public static int countConnectedComponentsBFS(Map<Integer, List<Integer>> graph, Set<Integer> visited) {

        int count = 0;
        for (int node : graph.keySet()) {
            if (exploreBFS(graph, node, visited)) {
                count++;
            }
        }


        return count;

    }

    public static int countConnectedComponents(Map<Integer, List<Integer>> graph, Set<Integer> visited) {

        int count = 0;
        for (int node : graph.keySet()) {
            if (explore(graph, node, visited)) {
                count++;
            }
        }


        return count;

    }

    private static boolean explore(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {

        if (visited.contains(node)) return false;

        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            visited.add(curr);

            for (int neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        return true;


    }

    private static boolean exploreBFS(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {

        if (visited.contains(node)) return false;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited.add(curr);

            for (int neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }

        return true;

    }

    public static int countConnectedComponentsRecursive(Map<Integer, List<Integer>> graph, Set<Integer> visited) {

        int count = 0;
        for (int node : graph.keySet()) {
            if (exploreRecursive(graph, node, visited)) {
                count++;
            }
        }


        return count;

    }

    private static boolean exploreRecursive(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {

        if (visited.contains(node)) return false;
        visited.add(node);

        for (int neighbor : graph.get(node)) {
            exploreRecursive(graph, neighbor, visited);
        }

        return true;

    }

}
