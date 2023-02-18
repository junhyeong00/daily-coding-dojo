class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};

            return answer;
        }

        answer = new int[arr.length - 1];
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        boolean removeSmallNumbers = false;

        for (int i = 0; i < arr.length; i += 1) {
            if (min == arr[i]) {
                removeSmallNumbers = true;
                continue;
            }

            if (removeSmallNumbers) {
                answer[i - 1] = arr[i];
                continue;
            }
            answer[i] = arr[i];
        }

        return answer;
    }
}
