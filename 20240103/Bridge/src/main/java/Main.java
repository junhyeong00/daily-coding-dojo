import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
    int x;
    int y;
    int distance;

    public Location(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class Main {
    private static int n;

    private static int min = Integer.MAX_VALUE;

    private static int groupNumber = 2;

    private static int[][] map;

    private static final int OCEAN = 0;
    private static final int LAND = 1;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j += 1) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        groupNumber = 2;

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (map[i][j] == LAND) {
                    map[i][j] = groupNumber;
                    distinguishIsland(i, j);
                    groupNumber += 1;
                }
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (map[i][j] == OCEAN) {
                    continue;
                }

                makeBridge(i, j, map[i][j]);
            }
        }

        System.out.println(min);
    }

    private static void distinguishIsland(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y, 0));

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = location.x + dx[i];
                int ny = location.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (map[nx][ny] == LAND) {
                    map[nx][ny] = groupNumber;

                    queue.offer(new Location(nx, ny, 0));
                }
            }
        }
    }

    private static void makeBridge(int x, int y, int groupNumber) {
        boolean[][] visited = new boolean[n][n];

        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(x, y, 0));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = location.x + dx[i];
                int ny = location.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (map[nx][ny] == groupNumber) {
                    continue;
                }

                if (map[nx][ny] == OCEAN) {
                    queue.offer(new Location(nx, ny, location.distance + 1));
                    visited[nx][ny] = true;
                    continue;
                }

                if (location.distance > 0) {
                    min = Math.min(min, location.distance);
                    return;
                }
            }
        }
    }
}
