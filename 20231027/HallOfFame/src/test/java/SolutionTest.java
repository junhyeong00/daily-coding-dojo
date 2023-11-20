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
        assertArrayEquals(new int[] {10, 10, 10, 20, 20, 100, 100},
                test.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}));
    }
}