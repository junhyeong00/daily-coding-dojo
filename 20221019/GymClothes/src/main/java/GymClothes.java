import java.util.HashMap;
import java.util.Map;

public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Map<Integer, Integer> possession = new HashMap<>();

        countGymClothes(n, lost, reserve, possession);

//        System.out.print(possession);

        for (int i = 1; i <= n; i += 1) {
            if (possession.get(i) != 0) {
                continue;
            }

            if (i != 1) {
                if (possession.get(i - 1) == 2) {
                    possession.put(i, 1);
                    possession.put(i - 1, 1);
                    continue;
                }
            }

            if (i != n) {
                if (possession.get(i + 1) == 2) {
                    possession.put(i, 1);
                    possession.put(i + 1, 1);
                }
            }
        }

        for (int i = 1; i <= n; i += 1) {
            if (possession.get(i) >= 1) {
                answer += 1;
            }
        }

//        System.out.print(possession);

        return answer;
    }

    public void countGymClothes(int n, int[] lost, int[] reserve, Map<Integer, Integer> possession) {
        for (int i = 1; i <= n; i += 1) {
            possession.put(i, 1);
        }

        for (int student : lost) {
            possession.put(student, possession.get(student) - 1);
        }

        for (int student : reserve) {
            possession.put(student, possession.get(student) + 1);
        }
    }
}
