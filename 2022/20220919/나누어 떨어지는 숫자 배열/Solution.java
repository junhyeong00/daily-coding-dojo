import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int element : arr) {
            if (element % divisor == 0) {
                answer.add(element);
            }
        }

        if (answer.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(answer);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
