package CompetetiveCoding;

import javafx.util.Pair;

import java.util.*;

public class ShortestPath {

    public static void main(String[] args) {

        List<List<String>> edges = List.of(
                List.of("a", "c"),
                List.of("a", "b"),
                List.of("c", "b"),
                List.of("c", "d"),
                List.of("b", "d"),
                List.of("e", "d"),
                List.of("g", "f")
        );

        HashMap<String, List<String>> graph = buildGraph(edges);
        Set<String> visited = new HashSet<>();

        System.out.println(findShortestPath(graph, "a", "e", visited));
        visited.clear();
        System.out.println(findShortestPathMap(graph, "a", "e", visited));
        System.out.println(findShortestPathDFS(graph, "a", "e", visited));

    }

    private static int findShortestPathDFS(HashMap<String, List<String>> graph, String start, String end, Set<String> visited) {

        Stack<String> stack = new Stack<>();
        Map<String, Integer> distance = new HashMap<>();
        distance.put(start, 0);
        stack.push(start);

        while (!stack.isEmpty()) {
            String curr = stack.pop();
            int currDistance = distance.get(curr);

            if (curr.equals(end)) return currDistance;

            for (String neighbor : graph.get(curr)) {
                if (!distance.containsKey(neighbor)) {
                    stack.push(neighbor);
                    distance.put(neighbor, currDistance + 1);
                }
            }
        }

        return -1;
    }

    private static int findShortestPathMap(HashMap<String, List<String>> graph, String start, String end, Set<String> visited) {

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        Map<String, Integer> distance = new HashMap<>();
        distance.put(start, 0);

        while (!queue.isEmpty()) {

            String curr = queue.poll();
            int currDistance = distance.get(curr);

            if (curr.equals(end)) return currDistance;

            for (String neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                    distance.put(neighbor, currDistance + 1);
                }
            }

        }

        return -1;
    }

    private static int findShortestPath(HashMap<String, List<String>> graph, String start, String end, Set<String> visited) {

        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(start, 0));

        while (!queue.isEmpty()) {

            Pair<String, Integer> currPair = queue.poll();
            String node = currPair.getKey();
            int distance = currPair.getValue();
            if (node.equals(end)) return distance;

            for (String neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(new Pair<>(neighbor, distance + 1));
                }
            }

        }
        return -1;
    }

    private static HashMap<String, List<String>> buildGraph(List<List<String>> edges) {

        HashMap<String, List<String>> graph = new HashMap<>();

        for (List<String> edge : edges) {
            String first = edge.get(0), second = edge.get(1);
            graph.computeIfAbsent(first, k-> new ArrayList<>()).add(second);
            graph.computeIfAbsent(second, k-> new ArrayList<>()).add(first);
        }

        return graph;

    }

    private static Map<Pair<Integer, Integer>, Integer> buildGraph(List<List<Integer>> edges, Integer a) {
        Map<Pair<Integer, Integer>, Integer> graph = new HashMap<>();

        for (List<Integer> edge : edges) {
            Integer first = edge.get(0);
            Integer second = edge.get(1);
            Integer distance = edge.get(2);

            graph.computeIfAbsent(new Pair<>(first, second), k -> distance);
        }

        return graph;
    }


}
