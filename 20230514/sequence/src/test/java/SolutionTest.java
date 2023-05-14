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
        assertEquals(18, test.solution(new int[]{7, 9, 1, 1, 4}));
    }

    // 원형수열에서 연속으로 올 수 있는 수들의 합의 개수를 구해야함
    // 중복은 안되니 set을 이용해서 다 넣는다
}
