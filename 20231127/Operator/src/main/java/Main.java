import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    private static int[] numbers;
    private static int[] operator;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        setNumbers(br, n);
        setOperator(br);

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int number, int index) {
        if (index == n) {
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }

        for (int i = 0; i < 4; i += 1) {
            if (operator[i] > 0) {
                operator[i] -= 1;

                int result = calculate(i, number, numbers[index]);

                dfs(result, index + 1);

                operator[i] += 1;
            }
        }
    }

    private static void setOperator(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        operator = new int[4];

        for (int i = 0; i < 4; i += 1) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void setNumbers(BufferedReader br, int n) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        numbers = new int[n];

        for (int i = 0; i < n; i += 1) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static int calculate(int operator, int x, int y) {
        int result = 0;

        switch (operator) {
            case 0:
                result = x + y;
                break;
            case 1:
                result = x - y;
                break;
            case 2:
                result = x * y;
                break;
            case 3:
                result = x / y;
                break;
        }

        return result;
    }
}
