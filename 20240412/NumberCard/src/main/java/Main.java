import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;

    private static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i += 1) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i += 1) {
            int number = Integer.parseInt(st.nextToken());

            int binaryNumber = binarySearch(number) ? 1 : 0;

            System.out.print(binaryNumber + " ");
        }
    }

    private static boolean binarySearch(int number) {
        int first = 0;
        int last = n - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (cards[mid] == number) {
                return true;
            }

            if (cards[mid] < number) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return false;
    }
}
