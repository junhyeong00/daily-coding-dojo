public class Fighter {
    public String solution(int[] food) {
        String answer = "";

        String half = getHalf(food);

        StringBuilder sb = new StringBuilder(half);


        answer += half;
        answer += "0";
        answer += sb.reverse();

        return answer;
    }

    public int toOddNumber(int number) {
        return number % 2 == 1 ? number - 1 : number;
    }

    public String getHalf(int[] numbers) {
        String half = "";

        for (int i = 1; i < numbers.length; i += 1) {
            int number = numbers[i];
            half += Integer.toString(i).repeat(toOddNumber(number) / 2);
        }

        return half;
    }
}
