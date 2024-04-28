import java.util.*;

class TwoQueue {
    static int func(Deque<Integer> q1, Deque<Integer> q2, long sum1, long sum2) {
        int cnt = 0;
        long targ = (sum1 + sum2) / 2;
        int len = q1.size() * 3;
        int idx = 0;

        while (idx < len) {
            idx += 1;
            if (sum1 > sum2) {
                int val = q1.poll();
                q2.add(val);
                sum1 -= val;
                sum2 += val;
                cnt += 1;
            } else if (sum1 < sum2) {
                int val = q2.poll();
                q1.add(val);
                sum1 += val;
                sum2 -= val;
                cnt += 1;
            } else return cnt;
        }
        return -1;
    }

    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        long sum1 = 0;
        long sum2 = 0;
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<Integer> q2 = new ArrayDeque<>();

        for (int i = 0; i < queue1.length; i += 1) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        if (sum1 == sum2) return 0;
        answer = func(q1, q2, sum1, sum2);

        return answer;
    }
}
