class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        double sum = 0;

        for (int number : arr) {
            sum += number;
        }

        answer = sum / arr.length;

        return answer;
    }
}
