import java.util.Arrays;

public class pro_boat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int count = 0;
        int index = 0;
        Arrays.sort(people);
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                count++;
            }
            else {
                count ++;
            }
        }
        System.out.println(count);
    }
}
