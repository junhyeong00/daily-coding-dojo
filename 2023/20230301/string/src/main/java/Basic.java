public class Basic {
    public boolean solution(String s) {
        if (!isCorrectLength(s)) {
            return false;
        }

        if (!isAllNumber(s)) {
            return false;
        }

        return true;
    }

    public boolean isCorrectLength(String s) {
        return s.length() == 4 || s.length() == 6;
    }

    public boolean isAllNumber(String s) {
        String[] words = s.split("");

        for (String word : words) {
            try {
                Integer.parseInt(word);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
