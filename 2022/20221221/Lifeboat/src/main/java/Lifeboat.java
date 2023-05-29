import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0, first = 0, last = people.length - 1;

        Arrays.sort(people);

        while (first <= last) {
            answer += 1;
            if (people[first] + people[last] <= limit) {
                first += 1;
            }
            last -= 1;
        }
        return answer;
    }
}
