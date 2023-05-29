class Solution {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];

        int i = 0;

        while (n > 0) {
            answer[i] = (int) (n % 10);

            n /= 10;
            i += 1;
        }

        return answer;
    }
}
