import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSListGraph {
    static boolean[] visited;
    static List<List<Integer>> adjList;
    static int[] distance;
    public static void main(String[] args) {
        int[][] inputArr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        int node_n = 5;
        visited = new boolean[node_n];
        adjList = new ArrayList<>();
        for (int i = 0; i < node_n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : inputArr) {
            addEdge(a[0], a[1]);
        }
        System.out.println("adjList = " + adjList);
        distance = new int[node_n];
        bfs(0);
    }
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start); //큐에 0을 담음
        while(!queue.isEmpty()){
            int next = queue.poll(); // 방문 0을 출력 next임
            System.out.print("next = "+ next+ " ");
            for(int target : adjList.get(next)){ //target - 0번째가 연결된 노드
                if(!visited[target]){ //들리지 않은 노드 1,2
                    queue.add(target); //방문예정인 데이터를 큐에 담는것
                    System.out.println("target : "+target);
//                    distance[target] = distance[next] + 1;
                    visited[target] = true;
                }
            }
        }
    }
    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
//        adjList.get(a).add(b); //양방향
    }


}
