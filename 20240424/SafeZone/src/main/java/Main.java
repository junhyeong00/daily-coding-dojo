import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int maxHeight;
    private static int maxSafeZoneCount = Integer.MIN_VALUE;

    private static int[][] map;
    private static boolean[][] visited;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        maxHeight = 1;

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j += 1) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] > maxHeight) {
                    maxHeight = map[i][j];
                }
            }
        }

        for (int height = 0; height <= maxHeight; height += 1) {
            visited = new boolean[n][n];
            int safeZoneCount = 0;

            for (int x = 0; x < n; x += 1) {
                for (int y = 0; y < n; y += 1) {
                    if (map[x][y] > height && !visited[x][y]) {
                        dfs(x, y, height);
                        safeZoneCount += 1;
                    }
                }
            }

            maxSafeZoneCount = Math.max(maxSafeZoneCount, safeZoneCount);
        }

        System.out.println(maxSafeZoneCount);
    }

    private static void dfs(int x, int y, int rainHeight) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }

            if (map[nx][ny] <= rainHeight) {
                continue;
            }

            dfs(nx, ny, rainHeight);
        }
    }
}
