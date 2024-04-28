import java.util.ArrayList;
import java.util.List;

public class CutArray {
    public List<Long> solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();

        for (long i = left; i < right + 1; i += 1) {
            answer.add(Math.max(i/ n, i % n) + 1);
        }

        return answer;
    }
}
