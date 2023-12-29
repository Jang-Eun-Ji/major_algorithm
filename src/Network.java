import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Network {
    static boolean[] visited;
    static List<List<Integer>> adjList;
    static int count;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println(adjList);
        for (int i = 0; i < computers.length; i++) {
            int a = 0;
            if(a == i){
                a++;
            }
            int b = a + 1;
            if(b == i){
                b++;
            }
            addEdge(computers[i][a], computers[i][b]);
            System.out.println("kk"+ computers[i][a] + computers[i][b]);
        }
        System.out.println(count/2);


    }
    static void addEdge(int a, int b) {
        count = count + a + b;
        if(a == 0 && b == 0){
            count = count + 2;
        }
    }
}
