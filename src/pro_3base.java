import java.util.Arrays;

public class pro_3base {
    public static void main(String[] args) {
        int n = 125;
        String temp = "";
        int answer = 0;
        while (n > 0){
            temp += Integer.toString(n % 3);
            n /= 3;
        }
        System.out.println(temp);

        int temp_length = temp.length();
        for (int i = 0; i < temp.length(); i++) {
            answer += Integer.parseInt(String.valueOf(temp.charAt(i))) * (int)Math.pow(3, temp_length);
            temp_length --;
        }
        System.out.println(answer);
    }
}
