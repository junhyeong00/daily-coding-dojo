class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        for (int i = 1; i <= count; i += 1) {
            totalPrice += price * i;
        }

        answer *= money - totalPrice;

        return answer < 0 ? 0 : answer;
    }
}
