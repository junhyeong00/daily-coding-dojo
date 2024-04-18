import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int n;
    private static int start = 1;
    private static int end = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        selectNumber("");
    }

    private static void selectNumber(String sequence) {
        if (sequence.length() == n) {
            System.out.println(sequence);
            System.exit(0);
        }

        for (int i = start; i <= end; i += 1) {
            if (isGoodSequence(sequence + i)) {
                selectNumber(sequence + i);
            }
        }
    }

    private static boolean isGoodSequence(String sequence) {
        for (int i = 1; i <= sequence.length() / 2; i += 1) {
            String front = sequence.substring(sequence.length() - i * 2, sequence.length() - i);
            String back = sequence.substring(sequence.length() - i);

            if (front.equals(back)) {
                return false;
            }
        }

        return true;
    }
}
