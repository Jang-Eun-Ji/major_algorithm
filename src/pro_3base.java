import java.util.Arrays;

public class pro_3base {
    public static void main(String[] args) {
        int n = 125;
        int answer = 0;

        String temp = "";

        while (n>0){
            temp += Integer.toString(n%3);
            n /=3;
        }

        for (int i = 0; i < temp.length(); i++) {
          answer += Integer.parseInt(String.valueOf(temp.charAt(i))) * Math.pow(3, (temp.length() - i - 1));
        }
        System.out.println(answer);
    }
}
