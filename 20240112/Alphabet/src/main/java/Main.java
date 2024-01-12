import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int r;
    private static int c;

    private static int max = Integer.MIN_VALUE;

    private static int[][] map;
    private static boolean[] visited;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        visited = new boolean[26];

        for (int i = 0; i < r; i += 1) {
            String str = br.readLine();
            for (int j = 0; j < c; j += 1) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }

        dfs(0, 0, 1);

        System.out.println(max);
    }

    private static void dfs(int x, int y, int count) {
        visited[map[x][y]] = true;
        max = Math.max(max, count);

        for (int i = 0; i < 4; i += 1) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                continue;
            }

            if (visited[map[nx][ny]]) {
                continue;
            }

            visited[map[nx][ny]] = true;
            dfs(nx, ny, count + 1);
            visited[map[nx][ny]] = false;
        }
    }
}
