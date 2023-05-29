class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int product = n * m;

        while (m > 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }

        int LCM = product / n;

        answer[0] = n;
        answer[1] = LCM;

        return answer;
    }
}
