import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int carriageCount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sum = new int[carriageCount + 1];
        int[][] dp = new int[4][carriageCount + 1];

        for (int i = 1; i <= carriageCount; i += 1) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        int carriageCountOfSmallTrain = Integer.parseInt(br.readLine());

        for (int i = 1; i < 4; i += 1) {
            for (int j = i * carriageCountOfSmallTrain; j <= carriageCount; j += 1) {
                dp[i][j] = Math.max(dp[i][j - 1],
                        dp[i - 1][j - carriageCountOfSmallTrain] + sum[j] - sum[j - carriageCountOfSmallTrain]);
            }
        }

        System.out.println(dp[3][carriageCount]);
    }
}
