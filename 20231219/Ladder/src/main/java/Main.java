import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, h;
    static int answer = -1;
    private static int[][] rowMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        rowMap = new int[h + 1][n + 1];

        int a, b;
        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine(), " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            rowMap[a][b] = 1;
            rowMap[a][b + 1] = -1;
        }

        for (int i = 0; i <= 3; i += 1) {
            dfs(0, i);
        }

        System.out.print(answer);
    }

    private static void dfs(int lineCount, int size) {
        if (lineCount == size) {
            if (check()) {
                System.out.print(lineCount);
                System.exit(0);
            }

            return;
        }

        for (int i = 1; i <= h; i += 1) {
            for (int j = 1; j < n; j += 1) {
                if (rowMap[i][j] != 0 || rowMap[i][j + 1] > 0) {
                    continue;
                }

                rowMap[i][j] = 1;
                rowMap[i][j + 1] = -1;
                dfs(lineCount + 1, size);
                rowMap[i][j] = 0;
                rowMap[i][j + 1] = 0;
            }
        }
    }

    private static boolean check() {
        for (int i = 1; i <= n; i += 1) {
            int row = 1;
            int column = i;

            while (row < h + 1) {
                if (rowMap[row][column] > 0) {
                    column += 1;
                } else if (rowMap[row][column] < 0) {
                    column -= 1;
                }

                row += 1;
            }

            if (column != i) {
                return false;
            }
        }
        return true;
    }
}
