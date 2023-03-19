import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < moves.length; i += 1) {
            for (int j = 0; j < board.length; j += 1) {
                if (board[j][moves[i] - 1] != 0) {
                    if (!basket.empty() && basket.peek() == board[j][moves[i] - 1]) {
                        answer += 1;

                        basket.pop();

                        board[j][moves[i] - 1] = 0;
                        break;
                    }

                    basket.push(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer * 2;
    }
}
