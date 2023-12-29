import java.util.*;

public class loadfind {
    static boolean[] visited;
    static List<List<Integer>> adjList;
    static int[] distance;
    static int count;

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
        int shortest = bfs(0, 3);
        System.out.println(shortest);

    }

    static int bfs(int start, int i) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int next = queue.poll(); //방문
            System.out.println("next = " + next + "dist: " + Arrays.toString(distance));
            if (next == i) {
                return distance[next];
            }
            for (int target : adjList.get(next)) {
                if (visited[target] != true) {
                    queue.add(target); //방문예정인 데이터를 큐에 담는것
                    distance[target] = distance[next] + 1;
                    visited[target] = true;
                }
            }
        }
        return - 1;
//        for(int i = 1; i<=3(높이길이 - 행의 개수); i++){
//            for (int j = 1; j<=5(가로길이 - 열의개수); j++){
//                1)시작 노드 번호표현식: (i-1) * 5(열의 갯수) + j
//               2) 타겟의 번호와 타겟의 유효성
//                2-1)타겟의 유효성i에 1빼면 왼쪽, j에 1빼면 위
//                2-2)타겟의 유효성 : i와 j가 상하좌우 길이 체크 - if문 4개써야함,
//                자주 쓰는 !상하좌우! 체크 로직
//                int[]dx = {-1,1,0,0};
//                int[]dy = {0,0,-1,1};
//                for(int d =0; d<4; d++){
//                    int target_i = i+ dx[d];
//                    int target_j = j+ dy[d];
//                    if(target_i>1 && target_i<= 3 && target_j>=1 && target_j<=5){
//                        addEdge((i-1)*5+j, (target_i-1)*5 + target_j)
//
//                }
    }

    static void addEdge(int a, int b) {

        adjList.get(a).add(b);
//        adjList.get(a).add(b); //양방향
    }
}

