import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int number = -1;

        for (int i = 0; i < arr.length; i += 1) {
            if (number != arr[i]) {
                answer.add(arr[i]);

                number = arr[i];
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
