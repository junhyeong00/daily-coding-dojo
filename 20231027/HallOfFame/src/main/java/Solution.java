import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] solution(int k, int[] scores) {
        int[] answer = new int[scores.length];

        Queue<Integer> hallOfFame = new PriorityQueue<>();

        for (int day = 1; day <= scores.length; day += 1) {
            int todayScore = scores[day - 1];

            hallOfFame.add(todayScore);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            int lowestScore = hallOfFame.peek();
            answer[day - 1] = lowestScore;
        }

        return answer;
    }
}
