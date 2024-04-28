import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> users = new HashMap<>();

        checkName(record, users);

        List<String> messages = new ArrayList<>();

        changeMessage(record, users, messages);

        String[] answer = convertToArray(messages);

        return answer;
    }

    private String[] convertToArray(List<String> messages) {
        String[] answer = new String[messages.size()];

        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = messages.get(i);
        }
        return answer;
    }

    private void checkName(String[] record, HashMap<String, String> users) {
        for (String message : record) {
            String[] words = message.split(" ");

            if (words[0].equals("Leave")) {
                continue;
            }

            users.put(words[1], words[2]);
        }
    }

    private void changeMessage(String[] record, HashMap<String, String> users, List<String> messages) {
        for (String message : record) {
            String[] words = message.split(" ");

            if (words[0].equals("Change")) {
                continue;
            }

            String printMessage = users.get(words[1]) + "님이 "
                    + (words[0].equals("Enter") ? "들어왔습니다." : "나갔습니다.");

            messages.add(printMessage);
        }
    }
}