public class Solution {
    public static final String[] POSSIBLE_PRONUNCIATION = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i += 1) {
            answer += checkPossibleBabbling(babbling[i]) ? 1 : 0;
        }

        return answer;
    }

    public boolean checkPossibleBabbling(String babbling) {
        String priorPronunciation = "";

        while (babbling.length() > 0) {
            int priorBabblingLength = babbling.length();

            for (String pronunciation : POSSIBLE_PRONUNCIATION) {
                if (babbling.charAt(0) == pronunciation.charAt(0)) {
                    if (babbling.length() < pronunciation.length()) {
                        return false;
                    }

                    if (babbling.substring(0, pronunciation.length()).equals(priorPronunciation)) {
                        return false;
                    }

                    if (!babbling.substring(0, pronunciation.length()).equals(pronunciation)) {
                        return false;
                    }

                    priorPronunciation = pronunciation;
                    babbling = babbling.substring(pronunciation.length());
                    break;
                }
            }

            if (babbling.length() == priorBabblingLength) {
                return false;
            }
        }

        return true;
    }
}
