public class LCM {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int number : arr) {
            answer = calcLCM(answer, number);
        }
        return answer;
    }

    public int calcLCM(int a, int b) {
        int greatestCommonDivisor = calcGCD(a, b);
        return a * b / greatestCommonDivisor;
    }

    public int calcGCD(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
