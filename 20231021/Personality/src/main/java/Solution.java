import java.util.HashMap;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < survey.length; i += 1) {
            int score = choices[i] - 4;

            if (score == 0) {
                continue;
            }

            if (score < 0) {
                char firstType = survey[i].charAt(0);
                scoreMap.put(firstType, scoreMap.getOrDefault(firstType, 0) - score);
                continue;
            }

            char secondType = survey[i].charAt(1);
            scoreMap.put(secondType, scoreMap.getOrDefault(secondType, 0) + score);
        }

        return new StringBuilder()
                .append(scoreMap.getOrDefault('R', 0) >= scoreMap.getOrDefault('T', 0) ? 'R' : 'T')
                .append(scoreMap.getOrDefault('C', 0) >= scoreMap.getOrDefault('F', 0) ? 'C' : 'F')
                .append(scoreMap.getOrDefault('J', 0) >= scoreMap.getOrDefault('M', 0) ? 'J' : 'M')
                .append(scoreMap.getOrDefault('A', 0) >= scoreMap.getOrDefault('N', 0) ? 'A' : 'N')
                .toString();
    }

    // 성격 유형의 검사지 만들기 문제

    // 검사지에는 총 n개의 질문이 있고, 각 질문에는 아래와 같은 7개의 선택지가 있음

    // 매우 비동의 - 유형 1 3점
    // 비동의 - 유형 1 2점
    // 약간 비동의
    // 모르겠음 - 0점
    // 약간 동의 - 유형 2 1점
    // 동의 - 유형 2 2점
    // 매우 동의
    // => 매우 3, x 2, 약간 1, 모르겠음 0

    // 각 지표에서 더 높은 점수를 받은 유형 선택, 점수가 같으면 사전순으로 빠른 성격 유형

    // 질문마다 판단하는 지표를 담은 1차원 문자열 배열 survey와 검사자가 각 질문마다
    // 선택한 선택지를 담은 1차원 정수 배열 choices가 매개변수로 주어짐
    // 이때, 검사자의 성격 유형 검사 결과를 지표 번호 순서대로 return

    // 0. 유형별 점수를 담을 hashMap생성
    // 1. 0번 질문 배열 확인
    // 2. 선택지에 -4를 빼서 점수와 선택한 선택지 확인
    // 3. 선택지에 점수 추가
    // 4. 반복(모든 질문)
    // 5. 점수를 통해 유형파악
}
