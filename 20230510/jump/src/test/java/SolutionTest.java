import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution test;

    @BeforeEach
    void setUp() {
        test = new Solution();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution(5));
        assertEquals(2, test.solution(6));
        assertEquals(5, test.solution(5000));
    }

    // 한번에 k칸 또는 온거리 * 2 순간이동
    // 순간이동은 배터리 소모 없음, 점프는 k만큼 소모
    // 구매자는 n만큼의 이동이 필요함
    // 사용해야하는 건전지 사용량의 최솟값을 구해야함

    // 일단 한칸씩 가서 2배수씩 곱한다
    // 더이상 두배수로 갈 수 없으면 남은 수만큼 점프한다
}
