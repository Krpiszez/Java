package CompetetiveCoding;

import java.util.*;

public class HasPath {

    public static void main(String[] args) {
        System.out.println(hasPath(graph, "j", "i"));
        System.out.println(hasPathBFS(graph, "j", "i"));
        System.out.println(hasPathRecursive(graph, "j", "i"));
    }

    static Map<String, List<String>> graph = Map.of(
            "f", List.of("g", "i"),
            "g", List.of("h"),
            "h", List.of(),
            "i", List.of("g", "k"),
            "j", List.of("i"),
            "k", List.of()
    );


    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {

        Stack<String> stack = new Stack<>();
        stack.push(src);

        while (!stack.isEmpty()) {
            String curr = stack.pop();

            if (curr.equals(dst)) return true;

            for (String str : graph.get(curr)) {
                stack.push(str);
            }
        }

        return false;
    }

    public static boolean hasPathBFS(Map<String, List<String>> graph, String src, String dst) {

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(src);
        visited.add(src);

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            if (curr.equals(dst)) return true;

            for (String str : graph.get(curr)) {
                if (!visited.contains(str)) {
                    queue.offer(str);
                    visited.add(str);
                }
            }
        }

        return false;
    }

    public static boolean hasPathRecursive(Map<String, List<String>> graph, String src, String dst) {

        if (src.equals(dst)) return true;

        for (String neighbor : graph.get(src)) {
            if (hasPathRecursive(graph, neighbor, dst)) {
                return true;
            }
        }


        return false;
    }

}
