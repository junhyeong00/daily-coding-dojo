public class Bracket {
    boolean solution(String s) {
        if (!s.startsWith("(") || !s.endsWith(")")) {
            return false;
        }

        int openBracket = 0;
        int closingBracket = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (openBracket < closingBracket) {
                return false;
            }

            if (s.charAt(i) == '(') {
                openBracket += 1;
                continue;
            }

            closingBracket += 1;
        }

        return openBracket == closingBracket;
    }
}
