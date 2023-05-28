import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Plus {
    public int[] solution(int[] numbers) {

        Set<Integer> sums = new HashSet<Integer>();

        for (int i = 0; i < numbers.length; i += 1) {
            for (int j = i + 1; j < numbers.length; j += 1) {
                int sum = numbers[i] + numbers[j];
                sums.add(sum);
            }
        }

        int[] answer = new int[sums.size()];

        int index = 0;

        for (int sum : sums){
            answer[index] = sum;
            index += 1;
        }
        Arrays.sort(answer);

        return answer;
    }
}
