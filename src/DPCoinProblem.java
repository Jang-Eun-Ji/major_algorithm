import java.util.Arrays;

public class DPCoinProblem {
    public static void main(String[] args) {
        //최소 동전의 갯수
        int[] coins = {1,4,5};
        int amount = 13;
        int answer = 0;

        int[]arr = new int[amount + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= amount ; i++) {
            int min = amount;
            for(int c : coins){
                if(i -c < 0 ) continue;
                if(min > arr[i -c]){
                    min = arr[i -c];
                }
            }
            arr[i] = min + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
