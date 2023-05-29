class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i += 1) {
            boolean primenumber = true;

            for (int j = 2; j * j <= i; j += 1) {
                if (i % j == 0) {
                    primenumber = false;
                    break;
                }
            }

            if (primenumber == false) {
                continue;
            }

            answer += 1;
        }

        return answer;
    }
}
