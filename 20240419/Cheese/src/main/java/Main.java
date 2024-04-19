import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
    int x;
    int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n;
    private static int m;

    private static int cheeseCount;
    private static int time;

    private static int[][] map;

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {1, -1, 0, 0};

    private static final int BLANK = 0;
    private static final int CHEESE = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        time = 0;
        cheeseCount = 0;

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j += 1) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == CHEESE) {
                    cheeseCount += 1;
                }
            }
        }

        while (cheeseCount != 0) {
            meltCheese();
            time += 1;
        }

        System.out.println(time);
    }

    private static void meltCheese() {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(0, 0));
        int[][] air = new int[n][m];
        air[0][0] = -1;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = location.x + dx[i];
                int ny = location.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (map[nx][ny] == CHEESE) {
                    air[nx][ny] += 1;
                }

                if (map[nx][ny] == BLANK && air[nx][ny] == 0) {
                    air[nx][ny] = -1;
                    queue.offer(new Location(nx, ny));
                }
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < m; j += 1) {
                if (air[i][j] >= 2) {
                    map[i][j] = 0;
                    cheeseCount -= 1;
                }
            }
        }
    }
}
