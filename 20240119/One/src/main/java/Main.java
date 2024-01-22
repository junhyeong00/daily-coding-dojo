import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];

        System.out.println(recursive(n));
    }

    private static int recursive(int n) {
        if (n == 1){
            return 0;
        }

        if (dp[n] > 0){
            return dp[n];
        }

        dp[n] = recursive(n - 1) + 1;

        if (n % 3 == 0) {
            dp[n] = Math.min(dp[n], recursive(n / 3) + 1);
        }

        if (n % 2 == 0) {
            dp[n] = Math.min(dp[n], recursive(n / 2) + 1);
        }

        return dp[n];
    }
}
