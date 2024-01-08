import java.util.*;

public class pro_triangle {

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int[][] arr = new int [triangle.length][triangle.length];
        arr[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            arr[i][0] = triangle[i][0] + arr[i -1][0];
            arr[i][i] = triangle[i][i] + arr[i -1][i -1];
            for (int j = 1; j <= i; j++) {
                arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - 1]) + triangle[i][j];
            }
        }
        Arrays.sort(arr[arr.length -1]);
        System.out.println(arr[arr.length-1][arr.length -1]);
    }
}