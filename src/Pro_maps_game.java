import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pro_maps_game {
    static int[][] visited;
    static int[][] move = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        visited = new int[maps.length][maps[0].length];

        for (int i = 0; i < maps.length; i++) {
            Arrays.fill(visited[i], -1);
        }
        visited[0][0] = 1;
        System.out.println(Arrays.deepToString(visited));
//        이거 뭐임 ?? 위에꺼
//아니 맵에 잠만 나 일단 뭐 해보고 말해드림 약간 컴 해킹당한것같아서 새롭다 핳ㅎ
//        nodeList = new ArrayList<>();
//        for (int i = 0; i < visited.length; i++) {
//            nodeList.add(new ArrayList<>());
//        }
//        int count = 0;
//        for (int i = 0; i < maps.length; i++) {
//            for (int j = 0; j < maps[0].length; j++) {
//                nodeList.get(count).add(i,j);
//                if(count == 24){
//                    break;
//                }
//                count++;
//                System.out.println(count);
//            }
//        }
//        System.out.println(nodeList);

        LinkedList<Node> Q = new LinkedList<>();
        Q.add(new Node(0, 0));

        while (!Q.isEmpty()) {
            Node now = Q.poll();
            for (int[] direction : move) {
                int nx = now.x + direction[0];
                int ny = now.y + direction[1];
                if (nx >= 0 && nx < maps[0].length && ny >= 0 && ny < maps.length) {
                    if (visited[nx][ny] == -1 && maps[nx][ny] == 1) {
                        visited[nx][ny] = visited[now.x][now.y] + 1;
                        Q.add(new Node(nx, ny));
                    }
                }
            }
        }
        System.out.println(visited[maps.length - 1][maps[0].length-1]);
    }


//        System.out.println(visited[maps[0].length -1][maps.length -1]);

//        System.out.println(Arrays.deepToString(visited));
//                1,1;
//        1,0/ 1,2/0,1/2,1
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
