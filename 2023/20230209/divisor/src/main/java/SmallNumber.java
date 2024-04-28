import java.util.Scanner;

public class SmallNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i += 1) {
            int number = scanner.nextInt();

            if (number < x) {
                sb.append(number).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
