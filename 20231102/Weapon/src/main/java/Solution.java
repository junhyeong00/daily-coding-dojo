public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i += 1) {
            int offensePower = calcNumberOfDivisors(i);

            if (offensePower > limit) {
                answer += power;
                continue;
            }

            answer += offensePower;
        }

        return answer;
    }

    public int calcNumberOfDivisors(int number) {
        int count = 0;

        for (int i = 1; i * i <= number; i += 1) {
            if (number % i == 0) {
                count += 1;

                if (i * i < number) {
                    count += 1;
                }
            }
        }

        return count;
    }
}
