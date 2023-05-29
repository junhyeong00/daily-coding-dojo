import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 한변 길이: ");

        int length = scanner.nextInt();

        System.out.println("나선형 배열: ");

        int output = length;
        int[][] array = new int[length][length];
        int SW = 1;
        int i = 0;
        int j = -1;
        int k = 0;

        while (true) {
            for (int c = 0; c < length; c += 1) {
                j += SW;
                array[i][j] = k;
                k += 1;
            }

            length -= 1;

            if (length == 0) {
                break;
            }

            for (int c = 0; c < length; c += 1) {
                i += SW;
                array[i][j] = k;
                k += 1;
            }

            SW *= -1;
        }

        for (i = 0; i < output; i += 1) {
            for (j = 0; j < output; j += 1) {
                System.out.printf("%2d ", array[i][j]);
            }

            System.out.println();
        }
    }
}
