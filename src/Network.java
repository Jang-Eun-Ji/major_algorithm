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

        visited = new boolean[n];
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
            int b = 1;
            if(b == i){
                b++;
                System.out.println("b"+b);
            }
            addEdge(computers[i][a], computers[i][b]);
            System.out.println("kk"+ computers[i][a] + computers[i][b]);
        }
        for (int[] a : computers) {
            addEdge(a[1], a[2]);
        }
        System.out.println("adjList = " + adjList);
//        for (int i = 0; i < adjList.size(); i++) {
//            if (adjList.get(i).equals(new ArrayList<>())){
//                adjList.remove(i);
//            }
//        }
//        for (int i = 0; i < adjList.size(); i++) {
//            count += adjList.get(i).size();
//        }
//        System.out.println("adjList = " + adjList);
//        System.out.println(count);
    }

    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
//        adjList.get(b).add(a); //양방향
    }
}
