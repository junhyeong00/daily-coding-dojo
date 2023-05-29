class Solution {
    public int solution(int num) {
        for (int i = 0; i < 500; i += 1 ) {
            if (num == 1) {
                return i;
            }

            if (num % 2 == 1) {
                num *= 3;
                num += 1;
                continue;
            }

            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
        }
        return -1;
    }
}
