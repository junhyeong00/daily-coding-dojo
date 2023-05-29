public class Bracket {
    public int solution(int n, int a, int b) {
        int round = 0;

        while (a != b) {
            round += 1;

            a = calcNextNumber(a);

            b = calcNextNumber(b);
        }

        return round;
    }

    public int calcNextNumber(int number) {
        if (number % 2 == 0) {
            return number / 2;
        }

        return number = (number + 1) / 2;
    }
}
