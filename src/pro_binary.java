import java.util.ArrayList;
import java.util.Arrays;

public class pro_binary {
    public static void main(String[] args) {
        int n = 7;
        int[] times = {7, 10};
        Arrays.sort(times);
        int start = 0;
        int end = times[times.length -1]*n;
        while (start <= end){
            int middle = (start + end)/2;
            int peopleNum = 0;
            for (int i = 0; i < times.length; i++) {
                peopleNum += middle/times[i];
            }
            if(peopleNum == n){
                System.out.println(middle);
                int temp = middle%times[0];
                middle -= temp;
                System.out.println(middle);
                break;
            }
            if(peopleNum < n){
                start = middle + 1;
            }
            if (peopleNum > n){
                end = middle -1;
            }
        }
    }

}
