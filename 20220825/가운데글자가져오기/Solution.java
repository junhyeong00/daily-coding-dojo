class Solution {
    public String solution(String s) {

        int length = s.length();

        if (length % 2 == 1) {
            return s.substring(length / 2, length / 2 + 1);
        }

        return s.substring(length / 2 - 1, length / 2 + 1);
    }
}
