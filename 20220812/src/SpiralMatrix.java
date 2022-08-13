import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        for (int y = 0; y < length; y += 1) {
            System.out.println();

            for (int x = 0; x < length; x += 1) {
                if (x >= y) {
                    System.out.print(x + y);
                    System.out.print("\t");
                    continue;
                }

                if (x < y) {
                    System.out.print((length - 1) * 4 - (x + y));
                    System.out.print("\t");
                    continue;
                }

                System.out.print(x);
                System.out.print("\t");
            }
        }
    }
}
