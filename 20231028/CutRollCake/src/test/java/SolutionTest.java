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
        assertEquals(2, test.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
        assertEquals(0, test.solution(new int[] {1, 2, 3, 1, 4}));
    }
}
