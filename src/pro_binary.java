import java.util.ArrayList;
import java.util.Arrays;

public class pro_binary {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        int []complish_people = new int[times[times.length -1]*times[0]];

        for (int i = 1; i < complish_people.length; i++) {
            for (int j = 0; j < times.length; j++) {
                complish_people[i] = times[j]*i;
            }
        }


        Arrays.sort(complish_people);
        System.out.println(Arrays.toString(complish_people));
    }

    static int bin(int n, int[] times){
        int start = 0;
        int last = times[times.length -1]*times[0]*n/2;
        while (start <= last){
            int middle = (start + last)/2;
//            if(middle < xx){
//                start = middle + 1;
//            }
//            if(middle > xx){
//                last = middle -1;
//            }
//            if(middle == xx){
//                return middle;
//            }
        }
        return -1;
    }
}
