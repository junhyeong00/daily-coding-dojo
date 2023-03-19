import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> reportedCount = new HashMap<>();
        HashMap<String, HashSet<String>> reportRecord = new HashMap<>();

        for (int i = 0; i < id_list.length; i += 1) {
            String name = id_list[i];
            reportRecord.put(name, new HashSet<>());
            reportedCount.put(name, i);
        }

        for (String user : report) {
            String[] users = user.split(" ");
            String from = users[0];
            String to = users[1];
            reportRecord.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i += 1) {
            HashSet<String> send = reportRecord.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[reportedCount.get(name)] += 1;
                }
            }
        }

        return answer;
    }
}
