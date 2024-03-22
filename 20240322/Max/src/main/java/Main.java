import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int maxSum = Integer.MIN_VALUE;
    static int n;

    static int[] numbers;
    static boolean[] visited;
    static int[] selectedNumbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        numbers = new int[n];

        for (int i = 0; i < n; i += 1) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[n];
        selectedNumbers = new int[n];

        dfs(0);

        System.out.println(maxSum);
    }

    private static void dfs(int depth) {
        if (depth == n) {
            maxSum = Math.max(maxSum, calculateSum());
            return;
        }

        for (int i = 0; i < n; i += 1) {
            if (!visited[i]) {
                selectedNumbers[depth] = numbers[i];
                visited[i] = true;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static int calculateSum() {
        int sum = 0;

        for (int i = 0; i < n - 1; i += 1) {
            sum += Math.abs(selectedNumbers[i] - selectedNumbers[i + 1]);
        }

        return sum;
    }
}
