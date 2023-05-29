public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i += 1) {

            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);

            while (binary.length() != n) {
                binary = "0" + binary;
            }

            binary = binary.replaceAll("1", "#");
            binary = binary.replaceAll("0", " ");

            answer[i] = binary;
        }

        return answer;
    }
}
