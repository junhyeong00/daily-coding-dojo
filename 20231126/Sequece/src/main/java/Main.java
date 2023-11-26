import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int start = 1;
    static int end = 3;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        selectNumber("");
    }

    public static void selectNumber(String s) {
        if (s.length() == n) {
            System.out.println(s);
            System.exit(0);
        }

        for (int i = start; i <= end; i += 1) {
            if (isGoodSequence(s + i)) {
                selectNumber(s + i);
            }
        }
    }

    public static boolean isGoodSequence(String s) {
        for (int i = 1; i <= s.length() / 2; i += 1) {
            String front = s.substring(s.length() - i * 2, s.length() - i);
            String back = s.substring(s.length() - i);

            if (front.equals(back)) {
                return false;
            }
        }
        return true;
    }
}
