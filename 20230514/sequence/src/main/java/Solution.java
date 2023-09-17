import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] elements) {
        int[] newElements = new int[elements.length * 2];

        for (int i = 0; i < newElements.length; i += 1) {
            newElements[i] = elements[i % elements.length];
        }

        Set<Integer> answer = new HashSet<>();

        for (int i = 1; i <= elements.length; i += 1) {
            for (int j = 0; j <= elements.length; j += 1) {
                answer.add(Arrays.stream(newElements, j, j + i).sum());
            }
        }

        return answer.size();
    }
}
