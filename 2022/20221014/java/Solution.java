class Solution {
    public int solution(String s) {
        String answer = "";
        String[] words = s.split("");

        String number = "";

        for (int i = 0; i < s.length(); i += 1) {
            number += words[i];

            number = convertStringToNumbers(number);

            if (isNumeric(number)) {
                answer += number;

                number = "";
            }
        }

        return Integer.parseInt(answer);
    }

    private String convertStringToNumbers(String number) {
        return switch (number) {
            case "zero" -> "0";
            case "one" -> "1";
            case "two" -> "2";
            case "three" -> "3";
            case "four" -> "4";
            case "five" -> "5";
            case "six" -> "6";
            case "seven" -> "7";
            case "eight" -> "8";
            case "nine" -> "9";
            default -> number;
        };
    }

    public boolean isNumeric(String number) {
        return number.matches("[0-9]+");
    }
}
