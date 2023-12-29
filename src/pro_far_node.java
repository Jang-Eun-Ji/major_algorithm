import java.util.*;

public class pro_far_node {
    static boolean[] visited;
    static List<List<Integer>> adjList;
    static int count;
    static int[][] move = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        visited = new boolean[n];
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println(adjList);
        for (int[] a : edge) {
            addEdge(a[0], a[1]);
            System.out.println("adjList" + adjList);
        }
        System.out.println("adjList = " + adjList);
//        답: 0,1,3,2,4
        dfs(1);
    }


    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int target : adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

