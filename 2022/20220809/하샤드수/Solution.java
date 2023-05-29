class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int number = x;

        while (x >= 1) {
            sum += x % 10;

            x /= 10;
        }

        if (number % sum != 0) {
            answer = false;
        }

        return answer;
    }
}
