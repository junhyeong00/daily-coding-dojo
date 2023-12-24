import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i += 1) {
            String[] place = places[i];

            boolean isOk = true;
            for (int r = 0; r < 5 && isOk; r += 1) {
                for (int c = 0; c < 5 && isOk; c += 1) {
                    if (place[r].charAt(c) == 'P') {
                        if (!bfs(r,c,place)) {
                            isOk = false;
                        }
                    }
                }
            }

            answer[i] = isOk ? 1 : 0;
        }

        return answer;
    }

    private boolean bfs(int r, int c, String[] place) {
        int dr[] = { -1, 1, 0, 0 };
        int dc[] = { 0, 0, -1, 1 };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { r, c });

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nr = position[0] + dr[i];
                int nc = position[1] + dc[i];

                if (nr < 0 || nc < 0 || nr >= 5 || nc >= 5 || (nr == r && nc == c)) {
                    continue;
                }

                int manhattanDistance = Math.abs(nr - r) + Math.abs(nc - c);

                if (place[nr].charAt(nc) == 'P' && manhattanDistance <= 2) {
                    return false;
                }

                if (place[nr].charAt(nc) == 'O' && manhattanDistance < 2) {
                    queue.offer(new int[] { nr, nc });
                }
            }
        }

        return true;
    }
}
