import java.util.Arrays;

public class DFSArrayGraph {
    static boolean[] visited;
    static int[][] static_graph;
    public static void main(String[] args) {
        int[][] graph =
                        {{0, 1, 1, 0, 0},
                        {1, 0, 0, 1, 0},
                        {1, 0, 0, 1, 1},
                        {0, 1, 1, 0, 0},
                        {0, 0, 1, 0, 0}};
        static_graph = graph;
        visited = new boolean[graph.length];
        dfs(0);
//        답: 0, 1,3,2,4
    }
    static void dfs(int start){
        visited[start] = true;
        for (int i = 0; i < static_graph[start].length; i++) {
            if(!visited[i] && static_graph[start][i] == 1) {
                System.out.println(i);
                dfs(i);
            }
        }
    }
}
