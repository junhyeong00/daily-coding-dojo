public class Fibonacci {
    public int solution(int n) {
        int fibonacciNumber = getFibonacciNumber(n);

        return fibonacciNumber;
    }

    public int getFibonacciNumber(int n) {
        int[] numbers = new int[n + 1];

        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i <= n; i += 1) {
            numbers[i] = (numbers[i - 1] + numbers[i - 2] ) % 1234567;
        }

        return numbers[n];
    }
}
