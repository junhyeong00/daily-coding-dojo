import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);

        Arrays.sort(scores, Collections.reverseOrder());

        int sum = 0;

        for (int i = m - 1; i < score.length; i += m) {
            sum += scores[i] * m;
        }

        return sum;
    }
}
