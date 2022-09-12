class Solution {
    public long solution(long n) {
        long answer = 0;

        if (Math.sqrt(n) == (long) Math.sqrt(n)) {
            long squareRoot = (long) Math.sqrt(n);

            answer = (long) Math.pow(squareRoot + 1, 2);
            return answer;
        }

        return -1;
    }
}
