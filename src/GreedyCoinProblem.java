import java.util.*;

public class GreedyCoinProblem {
    static int[] coins = {1, 5, 10, 25};
    static int amount = 99;
    static int idx = coins.length - 1;
    static int count = 0;
    public static void main(String[] args) {
        while (idx >= 0) {
            if (coins[idx] <= amount) {
                count += amount / coins[idx]; //coin의 가장 큰수부터 나눠서 count +
                amount %= coins[idx]; // 가장 큰 코인으로 나눠서 나머지를 amount로 함
            }
            idx -= 1;
        }
        System.out.println(count);
    }
}
