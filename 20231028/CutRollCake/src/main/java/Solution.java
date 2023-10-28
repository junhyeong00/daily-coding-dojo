import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> leftType = new HashSet<>();
        Map<Integer, Integer> rightType = new HashMap<>();

        for (int i = 0; i < topping.length; i += 1) {
            rightType.put(topping[i], rightType.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 0; i < topping.length; i += 1) {
            leftType.add(topping[i]);
            rightType.put(topping[i], rightType.get(topping[i]) - 1);

            if (rightType.get(topping[i]) == 0) {
                rightType.remove(topping[i]);
            }

            answer += leftType.size() == rightType.size() ? 1 : 0;
        }

        return answer;
    }
}
