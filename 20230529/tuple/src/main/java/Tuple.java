import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple {
    public int[] solution(String s) {

        s = s.substring(2, s.length() - 2).replace("},{", "-");

        String[] arrays = s.split("-");

        Arrays.sort(arrays, (o1, o2) -> o1.length() - o2.length());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arrays.length; i += 1) {
            String[] numbers = arrays[i].split(",");

            for (String number : numbers) {
                if (list.contains(Integer.parseInt(number))) {
                    continue;
                }

                list.add(Integer.parseInt(number));
            }
        }

        int[] answer = new int[arrays.length];

        for (int i = 0; i < arrays.length; i += 1) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
