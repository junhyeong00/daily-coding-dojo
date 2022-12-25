import java.util.ArrayList;
import java.util.HashMap;

public class Compress {
    public int[] solution(String msg) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 65; i <= 90; i += 1) {
            map.put(String.valueOf((char) i), i - 64);
        }

        int dirIdx = 27;
        int i = 0;
        int len = msg.length();
        while (i < len) {
            if (i == len - 1) {
                list.add(map.get(String.valueOf(msg.charAt(i))));
                break;
            }

            String w = String.valueOf(msg.charAt(i));
            i += 1;
            while (true) {

                if (i >= len) break;

                String next = String.valueOf(msg.charAt(i));

                if (!map.containsKey(w + next)) {
                    map.put(w + next, dirIdx);
                    dirIdx += 1;
                    break;
                }

                w += next;
                i += 1;
            }

            list.add(map.get(w));
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}
