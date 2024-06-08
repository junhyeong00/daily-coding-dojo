import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static int n;

    private static int houseCount = 0;

    private static int[][] map;
    private static boolean[][] visited;

    private static List<Integer> houseInComplexCounts;

    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    private static final int HOUSE = 1;
    private static final int BLANK = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        houseInComplexCounts = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            String str = br.readLine();

            for (int j = 0; j < n; j += 1) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (map[i][j] == HOUSE && !visited[i][j]) {
                    dfs(i, j);
                    houseInComplexCounts.add(houseCount);
                    houseCount = 0;
                }
            }
        }

        Collections.sort(houseInComplexCounts);

        System.out.println(houseInComplexCounts.size());

        for (Integer houseInComplexCount : houseInComplexCounts) {
            System.out.println(houseInComplexCount);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        houseCount += 1;

        for (int i = 0; i < 4; i += 1) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                continue;
            }

            if (visited[nx][ny]) {
                continue;
            }

            if (map[nx][ny] == BLANK) {
                continue;
            }

            dfs(nx, ny);
        }
    }
}
