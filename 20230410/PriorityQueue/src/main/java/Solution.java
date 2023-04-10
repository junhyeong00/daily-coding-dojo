import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (String operation : operations) {
            String[] word = operation.split(" ");

            String commend = word[0];
            int value = Integer.parseInt(word[1]);

            if (queue.size() < 1 &&  commend.equals("D")) {
                continue;
            }

            if (commend.equals("I")) {
                queue.offer(value);
                maxQueue.offer(value);
                continue;
            }

            if (value < 0) {
                int min = queue.poll();
                maxQueue.remove(min);
                continue;
            }

            int max = maxQueue.poll();
            queue.remove(max);
        }

        if (queue.size() > 0) {
            answer[0] = maxQueue.poll();
            answer[1] = queue.poll();
        }

        return answer;
    }
}
