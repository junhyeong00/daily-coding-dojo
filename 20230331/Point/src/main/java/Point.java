public class Point {
    public long solution(int k, int d) {
        long answer = 0;

        for (int i = 0; i <= d / k; i += 1) {
            long x = i * k;
            long y = (long) (Math.sqrt(Math.pow(d, 2) - Math.pow(x, 2)) / k);

            answer += y + 1;
        }

        return answer;
    }
}
