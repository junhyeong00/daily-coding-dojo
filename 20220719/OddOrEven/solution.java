class Solution {
    public String solution(int num) {

        String answer = "";

        int absolutevalue = Math.abs(num);

        if (absolutevalue % 2 == 0){
            answer = "Even";
        }

        if (absolutevalue % 2 == 1){
            answer = "Odd";
        }

        return answer;
    }
}
