package CompetetiveCoding;

import javafx.util.Pair;
import java.util.*;

public class ReconstructPath {

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
        var result = findShortestPathWithPath(graph, "e", "c");

        System.out.println("Distance: " + result.getKey());
        System.out.println("Path: " + result.getValue());
    }

    private static Pair<Integer, List<String>> findShortestPathWithPath(
            HashMap<String, List<String>> graph,
            String start,
            String end
    ) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> distance = new HashMap<>();
        Map<String, String> parent = new HashMap<>();

        queue.offer(start);
        visited.add(start);
        distance.put(start, 0);
        parent.put(start, null);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int currDistance = distance.get(curr);

            if (curr.equals(end)) {
                List<String> path = reconstructPath(parent, start, end);
                return new Pair<>(currDistance, path);
            }

            for (String neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                    distance.put(neighbor, currDistance + 1);
                    parent.put(neighbor, curr);
                }
            }
        }

        return new Pair<>(-1, List.of()); // no path
    }

    private static List<String> reconstructPath(Map<String, String> parent, String start, String end) {
        List<String> path = new ArrayList<>();
        String current = end;

        while (current != null) {
            path.add(current);
            if (current.equals(start)) break;
            current = parent.get(current);
        }

        if (!path.get(path.size() - 1).equals(start)) return List.of(); // unreachable

        Collections.reverse(path);
        return path;
    }

    private static HashMap<String, List<String>> buildGraph(List<List<String>> edges) {
        HashMap<String, List<String>> graph = new HashMap<>();
        for (List<String> edge : edges) {
            String first = edge.get(0), second = edge.get(1);
            graph.computeIfAbsent(first, k -> new ArrayList<>()).add(second);
            graph.computeIfAbsent(second, k -> new ArrayList<>()).add(first);
        }
        return graph;
    }
}
