class Solution {
    public int solution(int n) {
        int answer = 0;

        String ternary = Integer.toString(n, 3);

        String reverseNumber = new StringBuffer(ternary).reverse().toString();

        answer = Integer.parseInt(reverseNumber,3);

        return answer;
    }
}
