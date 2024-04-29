import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int n;

    private static int[][] grid;
    private static boolean[][] visited;

    private static int[] dx = {-1, 0, 0, 1};
    private static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        grid = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            String str = br.readLine();

            for (int j = 0; j < n; j += 1) {
                grid[i][j] = str.charAt(j);
            }
        }

        int normalAreaCount = calculateAreaCount();

        changeColor('G', 'R');

        int abnormalAreaCount = calculateAreaCount();

        System.out.println(normalAreaCount + " " + abnormalAreaCount);
    }

    private static void changeColor(char fromColor, char toColor) {
        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (grid[i][j] == fromColor) {
                    grid[i][j] = toColor;
                }
            }
        }
    }

    private static int calculateAreaCount() {
        int areaCount = 0;
        visited = new boolean[n][n];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (visited[i][j]) {
                    continue;
                }

                dfs(i, j, grid[i][j]);
                areaCount += 1;
            }
        }

        return areaCount;
    }

    private static void dfs(int x, int y, int color) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i += 1) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }

            if (grid[nx][ny] != color) {
                continue;
            }

            dfs(nx, ny, color);
        }
    }
}
