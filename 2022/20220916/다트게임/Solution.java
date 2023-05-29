class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] words = dartResult.split("");
        int[] score = new int[3];

        int index = -1;

        for (int i = 0; i < words.length; i += 1) {
            if (words[i].matches("[0-9]")) {
                index += 1;
                score[index] = Integer.parseInt(words[i]);

                if (words[i + 1].matches("[0-9]")) {
                    score[index] *= 10;
                    i += 1;
                }
            }

            switch (words[i]) {
                case "D":
                    score[index] = (int) Math.pow(score[index], 2);
                    break;
                case "T":
                    score[index] = (int) Math.pow(score[index], 3);
                    break;
                case "*":
                    score[index] *= 2;
                    if (index - 1 >= 0) score[index - 1] *= 2;
                    break;
                case "#":
                    score[index] *= -1;
            }
        }

        for (int s : score) {
            answer += s;
        }

        return answer;
    }
}
