import java.util.HashMap;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i += 1) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < answer.length; i += 1) {
            for (String personName : photo[i]) {
                answer[i] += scoreMap.getOrDefault(personName, 0);
            }
        }

        return answer;
    }

    // 사진 속의 인물의 그리움 점수의 합 = 추억 점수

    // 1. map에 name과 점수 저장
    // 2. 배열을 순회하며 해당하는 이름의 점수 계산
}
