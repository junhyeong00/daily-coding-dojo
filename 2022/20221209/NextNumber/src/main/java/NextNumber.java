public class NextNumber {
    public int solution(int n) {
        int answer = 0;

        int curOne = toBinary(n);

        while(true) {
            int nextOne = toBinary(++n);
            if(curOne == nextOne) break;
        }
        answer = n;

        return answer;
    }

    public int toBinary(int n) {
        int one = 1;

        while(n > 1) {
            if(n % 2 == 1) {
                one++;
            }
            n /= 2;
        }

        return one;
    }
}
