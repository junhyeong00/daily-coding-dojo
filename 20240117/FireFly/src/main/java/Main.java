import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] bottom = new int[h + 2];
        int[] top = new int[h + 2];

        for (int i = 1; i <= n / 2; i += 1) {
            int bottomSize = Integer.parseInt(br.readLine());
            int topSize = h - Integer.parseInt(br.readLine()) + 1;

            bottom[bottomSize] += 1;
            top[topSize] += 1;
        }

        for (int i = 1; i < h; i += 1) {
            top[i + 1] += top[i];
        }

        for (int i = h; i > 1; i -= 1) {
            bottom[i - 1] += bottom[i];

        }

        int min = n;
        int count = 0;

        for (int i = 1; i <= h; i += 1) {
            int conflictCount = bottom[i] + top[i];

            if (conflictCount < min) {
                min = conflictCount;
                count = 1;
                continue;
            }

            if (conflictCount == min) {
                count += 1;
            }
        }

        System.out.println(min + " " + count);
    }
}
