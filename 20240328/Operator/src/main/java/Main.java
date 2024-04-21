import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    private static int n;

    private static int[] numbers;
    private static int[] operatorCounts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        setNumbers(br);
        setOperatorCounts(br);

        dfs(1, numbers[0]);

        System.out.println(max);
        System.out.println(min);
    }

    private static void setOperatorCounts(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        operatorCounts = new int[4];

        for (int i = 0; i < 4; i += 1) {
            operatorCounts[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void setNumbers(BufferedReader br) throws IOException {
        numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i += 1) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int operatorIndex = 0; operatorIndex < 4; operatorIndex += 1) {
            if (operatorCounts[operatorIndex] > 0) {
                operatorCounts[operatorIndex] -= 1;

                dfs(depth + 1, calculate(operatorIndex, sum, numbers[depth]));

                operatorCounts[operatorIndex] += 1;
            }
        }
    }

    public static int calculate(int operator, int x, int y) {
        return switch (operator) {
            case 0 -> x + y;
            case 1 -> x - y;
            case 2 -> x * y;
            case 3 -> x / y;
            default -> 0;
        };
    }
}
