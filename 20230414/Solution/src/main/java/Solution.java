public class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int a = allDivisible(arrayA, arrayB);
        int b = allDivisible(arrayB, arrayA);

        return Math.max(a, b);
    }

    public int allDivisible(int[] array1, int[] array2) {
        int answer = 0;

        for (int number : array1) {
            answer = gcd(answer, number);
        }

        if (!allIndivisible(answer, array2)) {
            answer = 0;
        }

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public boolean allIndivisible(int divisor, int[] array) {
        boolean allIndivisible = true;

        for (int value : array) {
            if (value % divisor == 0) {
                allIndivisible = false;
                break;
            }
        }

        return allIndivisible;
    }
}
