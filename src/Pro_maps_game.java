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

}
