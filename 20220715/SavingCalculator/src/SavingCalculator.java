import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");

        double MonthlyEarnings = scanner.nextDouble();

        System.out.println("적금 기간을 입력해주세요(년):");

        double period = scanner.nextDouble();

        System.out.println("연이자율을 입력해주세요(%):");

        double InterestRate = scanner.nextDouble();

        //적금기간(월)
        double m = period * 12;
        //원금합계
        double sum = MonthlyEarnings * m;

        System.out.println("원금합계: " + format.format(sum) + "원");

        double r = InterestRate / 100 / 12;

        double BeforeTotal = MonthlyEarnings * (1 + r) * (Math.pow((1 + r), m) - 1 )/ r;

        double AfterTax = (BeforeTotal - sum) * 84.6/100;
        double total = sum + AfterTax;
        System.out.println("세후이자: " + format.format(AfterTax) + "원");

        System.out.println("세후 총 수령액: "+ format.format(total) + "원");
    }
}
