public class KeyPad {
    private int left;
    private int right;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        left = 10;
        right = 12;

        for (int number : numbers) {
            answer += getPressedHand(number, hand);
        }

        return answer;
    }

    public String getPressedHand(int number, String hand) {
        if (number == 0) {
            number = 11;
        }

        if (number % 3 == 1) {
            left = number;
            return "L";
        }

        if (number % 3 == 0) {
            right = number;
            return "R";
        }

        if (number % 3 == 2) {
            int leftGap = Math.abs(left - number) / 3 + Math.abs(left - number) % 3;
            int rightGap = Math.abs(right - number) / 3 + Math.abs(right - number) % 3;

            if (leftGap < rightGap) {
                left = number;
                return "L";
            }

            if (rightGap < leftGap) {
                right = number;
                return "R";
            }

            if (hand.equals("right")) {
                right = number;
                return "R";
            }

            if (hand.equals("left")) {
                left = number;
                return "L";
            }
        }
        return "";
    }
}
