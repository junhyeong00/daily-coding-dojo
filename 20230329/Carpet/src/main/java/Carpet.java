public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 1; i <brown; i += 1) {
            if (yellow == calcNecessaryYellow(brown, i)) {
                answer[0] = brown / 2 - i;
                answer[1] = i + 2;
                return answer;
            }
        }
        return answer;
    }

    public int calcNecessaryYellow(int brown, int i) {
        return (brown / 2 - i - 2) * i;
    }
}
