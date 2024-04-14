import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int maxSum = 0;

    private static int n;
    private static int m;

    private static int[] cards;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        cards = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i += 1) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        combination(0, 0);

        System.out.println(maxSum);
    }

    private static void combination(int count, int sum) {
        if (sum > m) {
            return;
        }

        if (count == 3) {
            maxSum = Math.max(maxSum, sum);

            if (sum == m) {
                System.out.println(sum);

                System.exit(0);
            }

            return;
        }

        for (int i = 0; i < n; i += 1) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            combination(count + 1, sum + cards[i]);
            visited[i] = false;
        }
    }
}
