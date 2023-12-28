import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int max = Integer.MIN_VALUE;

    private static int n;
    private static int m;

    private static int[][] map;

    private static final int BLANK = 0;
    private static final int WALL = 1;
    private static final int VIRUS = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j += 1) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(max);
    }

    private static void dfs(int wallCount) {
        if (wallCount == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                if (map[i][j] == BLANK) {
                    map[i][j] = WALL;
                    dfs(wallCount + 1);
                    map[i][j] = BLANK;
                }
            }
        }
    }

    private static void bfs() {
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        Queue<Point> queue = new LinkedList<>();
        int[][] virusMap = new int[n][m];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                virusMap[i][j] = map[i][j];

                if (map[i][j] == VIRUS) {
                    queue.add(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (0 > nx || n <= nx || 0 > ny || m <= ny) {
                    continue;
                }

                if (virusMap[nx][ny] == BLANK) {
                    virusMap[nx][ny] = VIRUS;

                    queue.add(new Point(nx, ny));
                }
            }
        }

        calculateSafeZone(virusMap);
    }

    private static void calculateSafeZone(int[][] virusMap) {
        int safeZoneCount = 0;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                if (virusMap[i][j] == BLANK) {
                    safeZoneCount += 1;
                }
            }
        }

        max = Math.max(max, safeZoneCount);
    }
}
