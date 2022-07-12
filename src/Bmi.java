import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI 측정기");
        System.out.print("신장(m): ");

        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double weight = scanner.nextDouble();

        //Math.pow() 제곱함수
      수 double bmi = weight/Math.pow(height, 2);

        if (bmi <= 18.5) {
            System.out.println("비만도 결과: 저체중");
        }
        if (18.5 < bmi && bmi <= 23) {
            System.out.println("비만도 결과: 정상");
        }
        if (23 < bmi && bmi <= 25) {
            System.out.println("비만도 결과: 과체중");
        }
        if (25 <bmi) {
            System.out.println("비만도 결과: 비만");
        }

        System.out.println("BMI: " + bmi);
    }
}
