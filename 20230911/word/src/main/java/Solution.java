import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i += 1) {
            int index = map.getOrDefault(s.charAt(i), -1);

            answer[i] = index < 0 ? -1 : i - index;

            map.put(s.charAt(i), i);
        }

        return answer;
    }

    // s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶음
    // 자신의 앞의 글자가 없으면 -1
    // 앞의 글자가 있으면 가장 가까운 글자와 얼마나 차이나는지. 예) 두 칸 앞이면 2
}
