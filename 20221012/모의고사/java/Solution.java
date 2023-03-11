import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i += 1) {
            if (person1[i % person1.length] == answers[i]) {
                score[0] += 1;
            }

            if (person2[i % person2.length] == answers[i]) {
                score[1] += 1;
            }

            if (person3[i % person3.length] == answers[i]) {
                score[2] += 1;
            }
        }

        int maximumScore = Math.max(Math.max(score[0], score[1]), score[2]);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < score.length; i += 1) {
            if (maximumScore == score[i]) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
