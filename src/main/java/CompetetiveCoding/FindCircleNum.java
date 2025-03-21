package CompetetiveCoding;

import java.util.LinkedList;
import java.util.Queue;

public class FindCircleNum {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int city = queue.poll();
                    visited[city] = true;

                    for (int neighbor = 0; neighbor < n; neighbor++) {
                        if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {
                            queue.add(neighbor);
                        }
                    }
                }

                provinces++;
            }

        }

        return provinces;

    }

    public static void main(String[] args) {
        FindCircleNum fcn = new FindCircleNum();
        System.out.println(fcn.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }
}
