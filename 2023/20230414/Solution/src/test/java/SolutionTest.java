import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void solution() {
        Solution test = new Solution();

        assertEquals(0, test.solution(new int[] {10,17}, new int[] {5,20}));
        assertEquals(10, test.solution(new int[] {10,20}, new int[] {5,17}));
        assertEquals(7, test.solution(new int[] {14,35,119}, new int[] {18,30,102}));
    }
}

// 원하는 값: 두 조건을 만족하는 가장 큰 양의 정수 a의 값

// 조건 1: 철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수
// 조건 2: 영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수

// 풀이
// 한 사람이 가진 카드중에 제일 작은 수부터 1씩 빼가며모든 수를 나눌 수 있는지 확인한다.
// 나눌 수 있는 수가 있다면 다른 사람의 카드를 나눌 수 없는지 확인한다
// 모두 만족하는 값을 바로 반환한다(가장 먼저 반환되는 값이 가장 큰 수)
// 만약, 없다면 0을 반환

// 반성: 최대공약수를 구하고 풀면 효율성이 높아진다.