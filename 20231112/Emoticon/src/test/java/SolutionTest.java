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
        assertArrayEquals(new int[]{1,5400},
                test.solution(new int[][]{{40, 10000},{25, 10000}}, new int[] {7000, 9000}));
    }
}
