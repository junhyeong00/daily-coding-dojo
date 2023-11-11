import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        int answer = 0;

        Stack<Integer> secondaryContainer = new Stack<>();
        int index = 0;
        int boxNumber = 1;

        while (order.length > index) {
            if (order[index] > boxNumber) {
                secondaryContainer.push(boxNumber);
                boxNumber += 1;
                continue;
            }

            if (order[index] == boxNumber) {
                answer += 1;
                boxNumber += 1;
                index += 1;
                continue;
            }

            while (!secondaryContainer.empty() && secondaryContainer.peek() == order[index]) {
                answer += 1;
                index += 1;
                secondaryContainer.pop();
            }

            if (index >= order.length || order[index] < boxNumber) {
                break;
            }
        }

        return answer;
    }
}
