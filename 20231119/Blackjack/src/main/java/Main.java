import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int winNumber = 0;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] cardNumbers = getCardNumbers(st, n);
        visited = new boolean[n];

        dfs(0, cardNumbers, m, 0);

        System.out.println(winNumber);
    }

    private static int[] getCardNumbers(StringTokenizer st, int n) {
        int[] cardNumbers = new int[n];

        for (int i = 0; i < n; i += 1) {
            cardNumbers[i] = Integer.parseInt(st.nextToken());
        }

        return cardNumbers;
    }

    private static void dfs(int depth, int[] cardNumbers, int m, int sum) {
        if (depth == 3) {
            if (winNumber < sum && sum <= m) {
                winNumber = sum;
            }

            return;
        }

        if (sum >= m) {
            return;
        }

        for (int i = 0; i < cardNumbers.length; i += 1) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, cardNumbers, m, sum + cardNumbers[i]);
                visited[i] = false;
            }
        }
    }
}
