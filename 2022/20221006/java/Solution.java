class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i += 1) {
            String[] characters = words[i].split("");

            int k = 1;
            for (String character : characters) {
                k += 1;

                if (k % 2 == 0) {
                    answer += character.toUpperCase();
                    continue;
                }

                answer += character.toLowerCase();
            }

            if (i != words.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}
