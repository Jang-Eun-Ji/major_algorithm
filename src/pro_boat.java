import java.util.Arrays;

public class pro_boat {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int count = people.length;
        Arrays.sort(people);

        int people_left = people.length - 1;

        while (people_left >= 0){
            if(people[people_left] < limit) {
                for (int i = people_left -1; i >= 0; i--) {
                    if(limit - people[people_left] >= people[i]){
                         count--;
                    }
                }
            }
            people_left--;
        }
        System.out.println(count);
    }
}
