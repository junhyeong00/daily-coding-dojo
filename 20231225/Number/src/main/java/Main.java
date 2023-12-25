import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static int n;

    private static int[][] map;
    private static boolean[][] visited;

    private static int complexCount;
    private static List<Integer> houseInComplexCounts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        complexCount = 0;
        houseInComplexCounts = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            String str = br.readLine();
            for (int j = 0; j < n; j += 1) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int x = 0; x < n; x += 1) {
            for (int y = 0; y < n; y += 1) {
                if (visited[x][y]) {
                    continue;
                }

                if (map[x][y] == 0) {
                    continue;
                }

                bfs(x, y);
            }
        }

        Collections.sort(houseInComplexCounts);

        System.out.println(complexCount);

        for (int i = 0; i < houseInComplexCounts.size(); i += 1) {
            System.out.println(houseInComplexCounts.get(i));
        }
    }

    private static void bfs(int x, int y) {
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y });
        visited[x][y] = true;

        int houseCount = 1;

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = position[0] + dx[i];
                int ny = position[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (map[nx][ny] == 0) {
                    continue;
                }

                houseCount += 1;
                visited[nx][ny] = true;

                queue.offer(new int[] {nx, ny});
            }
        }

        complexCount += 1;
        houseInComplexCounts.add(houseCount);
    }
}
