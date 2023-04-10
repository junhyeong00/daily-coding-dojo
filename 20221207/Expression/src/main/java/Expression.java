public class Expression {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i += 1) {
            if (validate(i, n)) {
                answer += 1;
            }
        }
            return answer;
    }

    public boolean validate(int i, int n) {
        int count = 0;

        if (i == n) {
            return true;
        }

        for (int j = i; j <= n; j += 1) {
            if (count == n) {
                return true;
            }

            if (count > n) {
                return false;
            }

            count += j;
        }

        return false;
    }
}
