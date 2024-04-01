import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n; // 세로선
    private static int m;
    private static int h; // 가로선

    private static int[][] ladder;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        ladder = new int[h + 1][n + 1];

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            ladder[a][b] = 1;
            ladder[a][b + 1] = -1;
        }

        for (int i = 0; i <= 3; i += 1) {
            dfs(0, i);
        }

        System.out.println(-1);
    }

    private static void dfs(int lineCount, int requestLineCount) {
        if (lineCount == requestLineCount) {
            if (check()) {
                System.out.print(lineCount);
                System.exit(0);
            }

            return;
        }

        for (int i = 1; i < n; i += 1) {
            for (int j = 1; j <= h; j += 1) {
                if (ladder[j][i] != 0 || ladder[j][i + 1] > 0) {
                    continue;
                }

                ladder[j][i] = 1;
                ladder[j][i + 1] = -1;
                dfs(lineCount + 1, requestLineCount);
                ladder[j][i] = 0;
                ladder[j][i + 1] = 0;
            }
        }
    }

    private static boolean check() {
        for (int i = 1; i <= n; i += 1) {
            int column = i;

            for (int j = 1; j <= h; j += 1) {
                if (ladder[j][column] > 0) {
                    column += 1;
                    continue;
                }

                if (ladder[j][column] < 0) {
                    column -= 1;
                }
            }

            if (column != i) {
                return false;
            }
        }

        return true;
    }
}
