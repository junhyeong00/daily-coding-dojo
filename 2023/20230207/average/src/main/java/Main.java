import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        double max = 0;
        double sum = 0;

        double[] scores = new double[count];

        for (int i = 0; i < count; i += 1) {
            scores[i] = scanner.nextDouble();

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        for (double score : scores) {
            sum += score / max * 100;
        }

        System.out.println(sum / count);
    }
}
