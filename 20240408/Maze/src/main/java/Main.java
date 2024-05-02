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
    private static int n;
    private static int m;

    private static int[][] maze;

    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];

        for (int i = 0; i < n; i += 1) {
            String line = br.readLine();

            for (int j = 0; j < m; j += 1) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (maze[nx][ny] != 1) {
                    continue;
                }

                maze[nx][ny] = maze[point.x][point.y] + 1;

                if (nx == n - 1 && ny == m - 1) {
                    System.out.println(maze[nx][ny]);
                    System.exit(0);
                }

                queue.add(new Point(nx, ny));
            }
        }
    }
}
