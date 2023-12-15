public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        convertToBinary(s, answer);

        return answer;
    }

    private void convertToBinary(String s, int[] answer) {
        if (s.equals("1")) {
            return;
        }

        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == '0') {
                zeroCount += 1;
                continue;
            }

            oneCount += 1;
        }

        answer[0] += 1;
        answer[1] += zeroCount;

        convertToBinary(Integer.toBinaryString(oneCount), answer);
    }
}
