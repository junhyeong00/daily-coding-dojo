import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mandarin {

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> sizeMap = countingBySize(tangerine);

        List<Integer> counts = new ArrayList<>(sizeMap.keySet());

        counts.sort((o1, o2) -> sizeMap.get(o2) - sizeMap.get(o1));

        for (int count : counts) {
            k -= sizeMap.get(count);

            answer += 1;

            if (k <= 0) {
                break;
            }
        }

        return answer;
    }

    private Map<Integer, Integer> countingBySize(int[] tangerine) {
        Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();

        for (int size : tangerine) {
           sizeMap.put(size, sizeMap.getOrDefault(size, 0) + 1);
        }

        return sizeMap;
    }
}
