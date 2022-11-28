class MaxAndMin {
    public String solution(String s) {
        String[] numbers = s.split(" ");

        int max = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[0]);

        for (String number : numbers) {
            max = Math.max(max, Integer.parseInt(number));
            min = Math.min(min, Integer.parseInt(number));
        }

        String answer = min + " " + max;
        return answer;
    }
}
