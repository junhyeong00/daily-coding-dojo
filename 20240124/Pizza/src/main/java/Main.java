import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int lastOvenFloor;
    private static int min;

    private static int[] oven;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ovenDepth = Integer.parseInt(st.nextToken());
        int pizzaCount = Integer.parseInt(st.nextToken());

        oven = new int[ovenDepth];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < ovenDepth; i += 1) {
            oven[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < ovenDepth; i += 1) {
            oven[i] = Math.min(oven[i], oven[i - 1]);
        }

        st = new StringTokenizer(br.readLine());

        lastOvenFloor = ovenDepth - 1;

        min = Integer.MAX_VALUE;

        for (int i = 0; i < pizzaCount; i += 1) {
            int pizzaSize = Integer.parseInt(st.nextToken());

            binarySearch(pizzaSize, 0, lastOvenFloor);
        }

        System.out.print(min + 1);
    }

    private static void binarySearch(int pizzaSize, int topIndex, int bottomIndex) {
        int result = -1;

        while (topIndex <= bottomIndex) {
            int mid = (topIndex + bottomIndex) / 2;
            if (oven[mid] >= pizzaSize) {
                result = mid;
                topIndex = mid + 1;
            } else {
                bottomIndex = mid - 1;
            }
        }

        min = Math.min(min, result);
        lastOvenFloor = result - 1;
    }
}
