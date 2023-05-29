public class BinaryNumber {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            String removed = removeZero(s);
            answer[1] += s.length() - removed.length();

            s = toBinaryNumber(removed.length());
            answer[0] += 1;
        }

        return answer;
    }

    public String toBinaryNumber(int length) {
        return Integer.toBinaryString(length);
    }

    public String removeZero(String s) {
        return s.replaceAll("0", "");
    }
}
