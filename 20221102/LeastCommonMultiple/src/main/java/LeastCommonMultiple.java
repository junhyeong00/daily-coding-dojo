public class LeastCommonMultiple {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int number : arr) {
            answer = calcLeastCommonMultiple(answer, number);
        }
        return answer;
    }

    public int calcLeastCommonMultiple(int a, int b) {
        int greatestCommonDivisor = calcGreatestCommonDivisor(a, b);
        return a * b / greatestCommonDivisor;
    }

    public int calcGreatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
