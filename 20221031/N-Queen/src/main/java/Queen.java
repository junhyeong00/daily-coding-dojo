public class Queen {
    private int count = 0;
    public int solution(int n) {
        int[] board = new int[n];

        backTrack(n, 0, board);

        return count;
    }

    private void backTrack(int n, int row, int[] board) {
        if (n == row) {
            count += 1;
            return;
        }

        for (int i = 0; i < n; i += 1) {
            board[row] = i;

            if (check(row, board)) {
                backTrack(n, row + 1, board);
            }
        }
    }

    private boolean check(int row, int[] board) {
        for (int i = 0; i < row; i += 1) {
            if (board[i] == board[row]) {
                return false;
            }

            if (Math.abs(row - i) == Math.abs(board[row] - board[i])) {
                return false;
            }
        }
        return true;
    }
}
