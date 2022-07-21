class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        char[] alphabet = new char[s.length()];

        int pcount = 0;
        int ycount = 0;

        for (int i = 0; i < s.length(); i += 1){
            alphabet[i] =s.charAt(i);

            if (alphabet[i] == 'p') {
                pcount  += 1;
            }
        }

        for (int i = 0; i < s.length(); i += 1){
            alphabet[i] =s.charAt(i);

            if (alphabet[i] == 'y') {
                ycount  += 1;
            }
        }

        boolean equivalence = pcount == ycount;

        if (!equivalence){
            answer = false;
        }


        return answer;
    }
}
