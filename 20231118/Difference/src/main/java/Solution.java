import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int max = 0;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numbers = new int[count];
        selected = new boolean[count];

        for (int i = 0; i < count; i += 1) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int[] selectedNumbers = new int[count];

        dfs(0, count, selectedNumbers, numbers);

        System.out.println(max);
    }

    private static void dfs(int depth, int count, int[] selectedNumbers, int[] numbers) {
        if (depth == count) {
            int sum = 0;

            for (int i = 0; i < count - 1; i += 1) {
                sum += Math.abs(selectedNumbers[i] - selectedNumbers[i + 1]);
            }

            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < count; i += 1) {
            if (!selected[i]) {
                selected[i] = true;

                selectedNumbers[depth] = numbers[i];

                dfs(depth + 1, count, selectedNumbers, numbers);

                selected[i] = false;
            }
        }
    }
}
