import java.util.Arrays;

public class Player {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i += 1) {
            if (i + 1 == participant.length) {
                return participant[i];
            }

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return answer;
    }
}
