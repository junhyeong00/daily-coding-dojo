import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k + 1];

        for (int i = 0; i < n; i += 1) {
            int coin = Integer.parseInt(br.readLine());

            for (int j = 1; j <= k; j += 1) {
                if (j - coin > 0) {
                    dp[j] += dp[j - coin];
                } else if (j - coin == 0) {
                    dp[j] += 1;
                }
            }
        }

        System.out.print(dp[k]);
    }
}
