import java.util.*;
public class pro_triangle {
    static int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    public static void main(String[] args) {
        int last_len = triangle[triangle.length -1].length;
        int[] arr = new int[triangle[triangle.length -1].length];
        int biggest_temp = 0;
        for (int i = last_len; i <= 0; i--) {
            int big_temp = triangle[last_len][i];
            if(triangle[last_len - 1][i] < triangle[last_len -1][i -1] && i!=0 && i !=last_len){
                big_temp = triangle[last_len -1][i -1];
            }else {
                big_temp = triangle[last_len - 1][i];
            }

        }
    }
}

