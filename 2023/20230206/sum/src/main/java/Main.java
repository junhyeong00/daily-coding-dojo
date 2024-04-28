import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;

        for (int i = 0; i < count; i += 1) {
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
