import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min = Integer.MAX_VALUE;
    private static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] status = new int[n][n];
        checked = new boolean[n];

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < n; j += 1) {
                status[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        buildTeam(0, 0, status, n);

        System.out.println(min);
    }

    private static void buildTeam(int index, int depth, int[][] status, int n) {
        if (depth == n / 2) {
            calculateStatusDifference(status, n);
            return;
        }

        for (int i = index; i < n; i += 1) {
            if (!checked[i]) {
                checked[i] = true;
                buildTeam(i + 1, depth + 1, status, n);
                checked[i] = false;
            }
        }
    }

    private static void calculateStatusDifference(int[][] status, int n) {
        int teamStartSum = 0;
        int teamLinkSum = 0;

        for (int i = 0; i < n - 1; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                if (checked[i] && checked[j]) {
                    teamStartSum += status[i][j];
                    teamStartSum += status[j][i];
                    continue;
                }

                if (!checked[i] && !checked[j]) {
                    teamLinkSum += status[i][j];
                    teamLinkSum += status[j][i];
                }
            }
        }

        int difference = Math.abs(teamStartSum - teamLinkSum);

        if(difference == 0) {
            System.out.println(difference);
            System.exit(0);
        }

        min = Math.min(min, difference);
    }
}
