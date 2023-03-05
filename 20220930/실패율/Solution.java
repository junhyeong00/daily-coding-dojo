import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> failure = new HashMap<>();
        Map<Integer, Integer> challenger = new HashMap<>();
        Map<Integer, Double> failureLate = new HashMap<>();

        for (int stage : stages) {
            for (int i = 1; i <= stage; i += 1) {
                if (challenger.get(i) == null) {
                    challenger.put(i, 1);
                    continue;
                }

                challenger.put(i, challenger.get(i) + 1);
            }

            if (failure.get(stage) == null) {
                failure.put(stage, 1);
                continue;
            }

            failure.put(stage, failure.get(stage) + 1);
        }

        for (int i = 1; i < N + 1; i += 1) {
            if (failure.get(i) == null) {
                failureLate.put(i, 0.0);
                continue;
            }

            failureLate.put(i, Double.valueOf(failure.get(i)) / Double.valueOf(challenger.get(i)));
        }

        List<Map.Entry<Integer, Double>> entryList =
                new LinkedList<Map.Entry<Integer, Double>>(failureLate.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        int i = 0;

        for (Map.Entry<Integer, Double> a : entryList) {
            answer[i] = a.getKey();
            i += 1;
        }

        return answer;
    }
}
