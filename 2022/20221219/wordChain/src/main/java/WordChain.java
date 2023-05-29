import java.util.ArrayList;
import java.util.List;

public class WordChain {
    public int[] solution(int n, String[] words) {
        char lastChar = words[0].charAt(0);
        double failIndex = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i += 1) {
            if (words[i].length() == 1 || words[i].length() == 0) {
                failIndex = i + 1;
                break;
            }

            if (words[i].charAt(0) != lastChar) {
                failIndex = i + 1;
                break;
            }

            if (list.contains(words[i])) {
                failIndex = i + 1;
                break;
            }

            list.add(words[i]);
            lastChar = words[i].charAt(words[i].length() - 1);

            if (i == words.length -1) {
                return new int[] {0, 0};
            }
        }

        int number = (int) (failIndex % n);
        int order = (int) Math.ceil(failIndex / n);

        if (number == 0) {
            number = n;
        }

        return new int[] {number, order};
    }
}
