public class JadenCase {
    public String solution(String s) {
        String[] words = s.split(" ");

        String answer = "";

        for (int i = 0; i < words.length; i += 1) {
            answer += changeJadenCase(words[i]);

            if (i < words.length - 1) {
                answer += " ";
            }
        }

        if (s.substring(s.length() - 1).equals(" ")) {
            answer += " ";
        }

        return answer;
    }

    public String changeJadenCase(String word) {
        if (word.length() == 0) {
            return "";
        }

        String firstLetter = word.substring(0, 1).toUpperCase();
        String remainLetter = word.substring(1).toLowerCase();

        return firstLetter + remainLetter;
    }
}
