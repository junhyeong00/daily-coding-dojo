import java.util.Arrays;

class Solution {
    public long solution(int[] nums) {
        long answer = 0;

        answer = Arrays.stream(nums).distinct().count();

        if (nums.length / 2 < answer) {
            return nums.length / 2;
        }

        return answer;
    }
}
