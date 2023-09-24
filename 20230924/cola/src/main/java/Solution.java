public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int refillColaCount = n / a * b;
            answer += refillColaCount;
            n = refillColaCount + n % a;
        }

        return answer;
    }

    // 빈 병 a개를 가져다주면 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는자를 일반화
    // 할 수 있는 프로그램 작성

    // n개를 a만큼 나눈 값에 b를 곱한 값을 구한다. (받은 병 수에 포함)
    // 나눈 병의 나머지 값을 더해 다시 빈 병 수를 계산한다.
    // 빈 병 수가 a보다 작아질때까지 반복한다
}
