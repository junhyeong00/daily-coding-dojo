import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> firstQueue = new LinkedList<>();
        Queue<Integer> secondQueue = new LinkedList<>();

        long firstQueueSum = 0;
        long secondQueueSum = 0;

        for(int i = 0; i < queue1.length; i += 1) {
            firstQueue.add(queue1[i]);
            secondQueue.add(queue2[i]);

            firstQueueSum += queue1[i];
            secondQueueSum += queue2[i];
        }

        if ((firstQueueSum + secondQueueSum) % 2 == 1) {
            return -1;
        }

        int count = 0;

        while (firstQueueSum != secondQueueSum) {
            if (count > queue1.length * 4) {
                return -1;
            }
            
            if (firstQueueSum > secondQueueSum) {
                int element = firstQueue.poll();
                secondQueue.add(element);

                firstQueueSum -= element;
                secondQueueSum += element;
            } else {
                int element = secondQueue.poll();
                firstQueue.add(element);

                secondQueueSum -= element;
                firstQueueSum += element;
            }

            count += 1;

        }

        return count;
    }
}
