public class Count {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i += 1) {
            long partialNumber = Long.parseLong(t.substring(i, i + p.length()));

            if (partialNumber <= Long.parseLong(p)) {
                answer += 1;
            }
        }

        return answer;
    }
}
