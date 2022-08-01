class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i += 1){
            if (signs[i] == true){
                answer += absolutes[i];
                continue;
            }

            answer -= absolutes[i];
        }
        return answer;
    }
}
