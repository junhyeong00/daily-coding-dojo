import java.util.Arrays;

public class Min {
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < A.length; i += 1) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }
}
