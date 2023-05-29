import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < strings.length; i += 1) {
            array.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(array);

        for (int i = 0; i < array.size(); i += 1) {
            answer[i] = array.get(i).substring(1, array.get(i).length());
        }

        return answer;
    }
}
