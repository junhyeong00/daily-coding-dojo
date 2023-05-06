import java.util.Arrays;
import java.util.Collections;

public class Index {
    public int solution(int[] citations) {
        int answer = 0;

        citations = Arrays.stream(citations)
                        .boxed().sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < citations.length; i += 1) {
            if (citations[i] < i + 1) {
                break;
            }
            answer += 1;
        }
        return answer;
    }
}
