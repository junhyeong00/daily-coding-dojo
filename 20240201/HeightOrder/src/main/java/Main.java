import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] check = new boolean[n][n];

        for (int i = 0; i < m; i += 1) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            check[a][b] = true;
        }

        for (int k = 0; k < n; k += 1) {
            for (int i = 0; i < n; i += 1) {
                for (int j = 0; j < n; j += 1) {
                    if (check[i][k] & check[k][j]) {
                        check[i][j] = true;
                    }
                }
            }
        }

        int[] counts = new int[n];

        for (int i = 0; i < n; i += 1) {
            for (int j = 0; j < n; j += 1) {
                if (check[i][j] || check[j][i]) {
                    counts[i] += 1;
                }
            }
        }

        int answer = 0;

        for (int count : counts) {
            answer += count == n - 1 ? 1 : 0;
        }

        System.out.println(answer);
    }
}
