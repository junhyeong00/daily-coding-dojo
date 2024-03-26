import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int min = Integer.MAX_VALUE;

    private static int n;

    private static int[][] status;
    private static boolean[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        status = new int[n][n];
        checked = new boolean[n];

        for (int i = 0; i < n; i += 1) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < n; j += 1) {
                status[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        buildTeam(0, 0);

        System.out.println(min);
    }

    private static void buildTeam(int count, int index) {
        if (count == n / 2) {
            calculateDifference();
            return;
        }

        for (int i = index; i < n; i += 1) {
            if (checked[i]) {
                continue;
            }

            checked[i] = true;
            buildTeam(count + 1, i + 1);
            checked[i] = false;
        }
    }

    private static void calculateDifference() {
        int startTeamSum = 0;
        int linkTeamSum = 0;

        for (int i = 0; i < n - 1; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                if (checked[i] && checked[j]) {
                    startTeamSum += status[i][j];
                    startTeamSum += status[j][i];
                    continue;
                }

                if (!checked[i] && !checked[j]) {
                    linkTeamSum += status[i][j];
                    linkTeamSum += status[j][i];
                }
            }
        }

        int difference = Math.abs(startTeamSum - linkTeamSum);

        if(difference == 0) {
            System.out.println(difference);
            System.exit(0);
        }

        min = Math.min(min, difference);
    }
}
