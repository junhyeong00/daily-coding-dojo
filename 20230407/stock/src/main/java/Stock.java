public class Stock {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i += 1) {
            for (int j = i + 1; j < prices.length; j += 1) {
                answer[i] += 1;

                if (prices[i] > prices[j]) {
                   break;
                }
            }
        }

        return answer;
    }
}
