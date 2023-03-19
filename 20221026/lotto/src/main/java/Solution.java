class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int unknownCount = 0;
        int matched = 0;

        for (int number : lottos) {
            if (number == 0) {
                unknownCount += 1;
                continue;
            }

            for (int win : win_nums) {
                if (number == win) {
                    matched += 1;
                    break;
                }
            }
        }

        int min = matched;
        int max = matched + unknownCount;

        answer[0] = calcWinning(max);
        answer[1] = calcWinning(min);
        return answer;
    }

    private int calcWinning(int number) {
        return switch (number) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
