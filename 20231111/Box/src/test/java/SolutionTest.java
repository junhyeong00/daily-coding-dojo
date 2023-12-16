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
        assertEquals(2, test.solution(new int[]{4, 3, 1, 2, 5}));
        assertEquals(5, test.solution(new int[]{5, 4, 3, 2, 1}));
    }
}
