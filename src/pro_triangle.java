import java.util.*;
public class pro_triangle {
    static int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    public static void main(String[] args) {
        int last_len = triangle[triangle.length -1].length;
        int[] arr = new int[triangle[triangle.length -1].length];
        int biggest_temp = 0;
        for (int i = 0; i < triangle[triangle.length -1].length; i++) {
            Num(i, last_len);
        }
    }
    static int Num(int k, int last_len){
        for (int i = last_len -1; i >= 0; i--) {
            int big_temp = k;
            if(triangle[i-1][i] < triangle[i -1][i -1] && i!=0 && i !=last_len){
                big_temp += triangle[last_len -1][i -1];
            }else {
                big_temp += triangle[last_len - 1][i];
            }
            if(){// 다차면 biggest에 담기, 메소드 만들기?

            }
            return big_temp;

        }
    }
}

