import java.util.HashMap;
import java.util.Map;

public class Discount {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wants = new HashMap<>();

        for (int i = 0; i < want.length; i += 1) {
            wants.put(want[i], number[i]);
        }

        Map<String, Integer> discountMap = new HashMap<>();

        for (int i = 0; i < 10; i += 1) {
            String item = discount[i];
            discountMap.put(item, discountMap.getOrDefault(item, 0) + 1);
        }

        if (isEqual(wants, discountMap)) {
            answer += 1;
        }

        for (int i = 1; i <= discount.length - 10; i += 1) {
            String deleteItem = discount[i - 1];
            discountMap.put(deleteItem, discountMap.get(deleteItem) - 1);

            String addItem = discount[i - 1 + 10];
            discountMap.put(addItem, discountMap.getOrDefault(addItem, 0) + 1);

            if (isEqual(wants, discountMap)) {
                answer += 1;
            }
        }

        return answer;
    }

    public boolean isEqual(Map<String, Integer> wantMap, Map<String, Integer> compareMap) {
        for (String key : wantMap.keySet()) {
            if (!compareMap.containsKey(key) || wantMap.get(key) > compareMap.get(key)) {
                return false;
            }
        }

        return true;
    }
}
