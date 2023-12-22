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
    private static int n, m;
    private static int min = Integer.MAX_VALUE;

    private static List<Point> chickenPoints;
    private static List<Point> housePoints;
    private static boolean[] openChickenHouse;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        housePoints = new ArrayList<>();
        chickenPoints = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j += 1) {
                int point = Integer.parseInt(st.nextToken());

                if (point == 1) {
                    housePoints.add(new Point(i, j));
                }

                if (point == 2) {
                    chickenPoints.add(new Point(i, j));
                }
            }
        }

        openChickenHouse = new boolean[chickenPoints.size()];

        dfs(0, 0);

        System.out.println(min);
    }

    private static void dfs(int startIndex, int openChickenHouseCount) {
        if (openChickenHouseCount == m) {
            calculate();
            return;
        }

        for (int i = startIndex; i < chickenPoints.size(); i += 1) {
                if (!openChickenHouse[i]) {
                    openChickenHouse[i] = true;
                    dfs(i + 1, openChickenHouseCount + 1);
                    openChickenHouse[i] = false;
                }
        }
    }

    private static void calculate() {
        int totalDistance = 0;

        for (int i = 0; i < housePoints.size(); i += 1) {
            int minDistance = Integer.MAX_VALUE;

            for (int j = 0; j < chickenPoints.size(); j += 1) {
                if (openChickenHouse[j]) {
                    int distance = Math.abs(housePoints.get(i).x - chickenPoints.get(j).x)
                            + Math.abs(housePoints.get(i).y - chickenPoints.get(j).y);

                    minDistance = Math.min(minDistance, distance);
                }
            }

            totalDistance += minDistance;
        }

        min = Math.min(min, totalDistance);
    }
}
