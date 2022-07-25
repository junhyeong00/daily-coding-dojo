class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i =0; i <= 9; i += 1){
            for (int j = 0; j <numbers.length; j += 1 ){
                if (numbers[j] == i) {
                    answer -= i;
                }
            }

            answer += i;
        }

        return answer;
    }
}
