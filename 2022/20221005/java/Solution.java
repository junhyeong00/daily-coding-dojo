import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String answer = "";

        String[] numbers = Long.toString(n).split("");

        Arrays.sort(numbers, Collections.reverseOrder());

        for (String number: numbers) {
            answer += number;
        }
        return Long.parseLong(answer);
    }
}
