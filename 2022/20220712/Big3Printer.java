import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("할 일1: ");

        String work1 = scanner.nextLine();

        System.out.print("할 일2: ");

        String work2 = scanner.nextLine();

        System.out.print("할 일3: ");

        String work3 = scanner.nextLine();

        System.out.println("오늘의 할 일 Big3는");
        System.out.println("1. " + work1);
        System.out.println("2. " + work2);
        System.out.println("3. " + work3);
    }

}