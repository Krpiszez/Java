package CompetetiveCoding;

import java.util.*;

public class UndirectedPath {

    public static void main(String[] args) {

        HashMap<String, List<String>> graph = buildGraph();
        Set<String> visited = new HashSet<>();

        System.out.println(undirectedPath("m", "j"));
        System.out.println(undirectedPathRecursive(graph, "m", "j", visited));

    }

    static List<List<String>> edges = List.of(
            List.of("i", "j"),
            List.of("k", "i"),
            List.of("m", "k"),
            List.of("k", "l"),
            List.of("o", "n")
    );


    public static boolean undirectedPath(String src, String dst) {

        HashMap<String, List<String>> graph = buildGraph();
        Stack<String> stack = new Stack<>();
        stack.push(src);
        Set<String> visited = new HashSet<>();
        visited.add(src);
        
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            
            if (curr.equals(dst)) return true;
            
            for (String neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return false;
    }

    public static boolean undirectedPathRecursive(HashMap<String, List<String>> graph, String src, String dst, Set<String> visited) {

        if (src.equals(dst)) return true;
        if (visited.contains(src)) return false;
        visited.add(src);

        for (String neighbor : graph.get(src)) {
            if (undirectedPathRecursive(graph, neighbor, dst, visited)) {
                return true;
            }
        }



        return false;
    }

    private static HashMap<String, List<String>> buildGraph() {

        HashMap<String, List<String>> graph = new HashMap<>();

        for (List<String> stringList : edges) {
            String first = stringList.get(0);
            String second = stringList.get(1);

            graph.computeIfAbsent(first, k -> new ArrayList<>()).add(second);
            graph.computeIfAbsent(second, k -> new ArrayList<>()).add(first);

        }

        return graph;

    }

}
