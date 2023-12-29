import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Shark {
    int size;
    int eatenCount;

    public Shark(int size) {
        this.size = size;
        this.eatenCount = 0;
    }

    public void eat() {
        eatenCount += 1;

        if (eatenCount == size) {
            size += 1;
            eatenCount = 0;
        }
    }

    public boolean isEat(int fishSize) {
        return fishSize < size;
    }

    public boolean isPass(int fishSize) {
        return fishSize <= size;
    }
}

class Location {
    int x;
    int y;
    int time;

    public Location(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

public class Main {
    private static int n;
    private static int time;

    private static int[][] map;

    private static Shark shark;

    private static Location sharkLocation;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    private static final int SHARK_LOCATION = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j += 1) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == SHARK_LOCATION) {
                    shark = new Shark(2);
                    sharkLocation = new Location(i, j, 0);

                    map[i][j] = 0;
                }
            }
        }

        int timeSum = 0;

        while (findFood()) {
            timeSum += time;
        }

        System.out.println(timeSum);
    }

    private static boolean findFood() {
        time = 0;

        boolean[][] visited = new boolean[n][n];

        Queue<Location> queue = new LinkedList<>();
        queue.offer(sharkLocation);
        visited[sharkLocation.x][sharkLocation.y] = true;

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int minTime = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Location location = queue.poll();

            if (location.time >= minTime) {
                break;
            }

            for (int i = 0; i < 4; i += 1) {
                int nx = location.x + dx[i];
                int ny = location.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                if (!shark.isPass(map[nx][ny])) {
                    continue;
                }

                if (map[nx][ny] > 0 && shark.isEat(map[nx][ny])) {
                    if (nx < minX) {
                        minX = nx;
                        minY = ny;
                        minTime = location.time + 1;
                    } else if (nx == minX) {
                        if (ny < minY) {
                            minY = ny;
                            minTime = location.time + 1;
                        }
                    }
                }

                queue.offer(new Location(nx, ny, location.time + 1));
                visited[nx][ny] = true;
            }
        }

        if (minTime == Integer.MAX_VALUE) {
            return false;
        }

        sharkLocation = new Location(minX, minY, 0);
        time = minTime;
        shark.eat();
        map[sharkLocation.x][sharkLocation.y] = 0;

        return true;
    }
}
