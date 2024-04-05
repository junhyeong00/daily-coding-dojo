import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    private static int[][] map;

    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    private static List<Integer> houseInComplexCounts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        houseInComplexCounts = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            String line = br.readLine();

            for (int j = 0; j < n; j += 1) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (map[i][j] == 1) {
                    bfs(i, j);
                }
            }
        }

        Collections.sort(houseInComplexCounts);

        System.out.println(houseInComplexCounts.size());

        for (Integer houseInComplexCount : houseInComplexCounts) {
            System.out.println(houseInComplexCount);
        }
    }

    private static void bfs(int x, int y) {
        map[x][y] = 0;

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        int houseInComplexCount = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i += 1) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (map[nx][ny] != 1) {
                    continue;
                }

                map[nx][ny] = 0;
                houseInComplexCount += 1;
                queue.offer(new Point(nx, ny));
            }
        }

        houseInComplexCounts.add(houseInComplexCount);
    }
}
