import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
    private static int min = Integer.MAX_VALUE;

    private static int n;
    private static int m;

    private static final int HOUSE = 1;
    private static final int CHICKEN = 2;

    private static List<Point> chickenPoints;
    private static List<Point> housePoints;
    private static boolean[] openChickenHouse;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        chickenPoints = new ArrayList<>();
        housePoints = new ArrayList<>();

        for (int i = 1; i <= n; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j += 1) {
                int point = Integer.parseInt(st.nextToken());
                if (point == HOUSE) {
                    housePoints.add(new Point(i, j));
                }

                if (point == CHICKEN) {
                    chickenPoints.add(new Point(i, j));
                }
            }
        }

        openChickenHouse = new boolean[chickenPoints.size()];

        dfs(0, 0);

        System.out.println(min);
    }

    private static void dfs(int count, int startIndex) {
        if (count == m) {
            int chickenDistance = calculateChickenDistance();

            min = Math.min(min, chickenDistance);
            return;
        }

        for (int i = startIndex; i < chickenPoints.size(); i += 1) {
            if (openChickenHouse[i]) {
                continue;
            }

            openChickenHouse[i] = true;
            dfs(count + 1, i);
            openChickenHouse[i] = false;
        }
    }

    private static int calculateChickenDistance() {
        int totalDistance = 0;

        for (int i = 0; i < housePoints.size(); i += 1) {
            int minDistance = Integer.MAX_VALUE;

            for (int j = 0; j < chickenPoints.size(); j += 1) {
                if (!openChickenHouse[j]) {
                    continue;
                }

                int distance = Math.abs(housePoints.get(i).x - chickenPoints.get(j).x) +
                        Math.abs(housePoints.get(i).y - chickenPoints.get(j).y);

                minDistance = Math.min(minDistance, distance);
            }

            totalDistance += minDistance;
        }

        return totalDistance;
    }
}
