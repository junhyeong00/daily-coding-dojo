public class Solution {
    public static final String WORDS = "AEIOU";
    public static final int[] INCREASE_VALUES = {781, 156, 31, 6, 1};

    public int solution(String word) {
        int answer = word.length();

        for (int i = 0; i < word.length(); i += 1) {
            answer += INCREASE_VALUES[i] * WORDS.indexOf(word.charAt(i));
        }

        return answer;
    }
}
