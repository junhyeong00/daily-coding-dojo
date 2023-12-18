public class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        int currentNumber = 0;
        int order = 1;

        while (answer.length() < t) {
            String convertedNumber = Integer.toString(currentNumber, n);

            for (int i = 0; i < convertedNumber.length(); i += 1) {
                if (answer.length() == t) {
                    break;
                }

                if (order == p) {
                    answer.append(convertedNumber.charAt(i));
                }

                order += 1;

                if (order == m + 1) {
                    order = 1;
                }
            }

            currentNumber += 1;
        }

        return answer.toString().toUpperCase();
    }
}
