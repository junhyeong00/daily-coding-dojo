class Solution {
    public int solution(int left, int right) {
        int answer = 0;


        for (int i = left; i <= right; i += 1) {
            int numberOfFactors = 0;
            for(int j = 1; j <= i; j += 1) {
                if (i % j == 0) {
                    numberOfFactors += 1;
                }
            }

            if (numberOfFactors % 2 == 0) {
                answer += i;
            }

            if (numberOfFactors % 2 == 1) {
                answer -= i;
            }
        }

        return answer;
    }
}
