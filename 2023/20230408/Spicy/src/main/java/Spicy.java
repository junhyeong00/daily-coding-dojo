import java.util.PriorityQueue;

public class Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int number : scoville) {
            queue.add(number);
        }

        while (queue.peek() < K) {
            if (queue.size() == 1) {
                return -1;
            }

            queue.add(queue.poll() + queue.poll() * 2);
            answer += 1;
        }
        return answer;
    }
}
