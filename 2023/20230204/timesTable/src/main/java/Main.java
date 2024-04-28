import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i += 1) {
            int n = scanner.nextInt();

            sum += Math.max(n, 40);
        }

        System.out.println(sum / 5);
    }
}
