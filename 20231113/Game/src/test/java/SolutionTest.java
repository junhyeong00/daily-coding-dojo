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
        assertEquals("0111", test.solution(2, 4, 2, 1));
        assertEquals("02468ACE11111111", test.solution(16, 16, 2, 1));
        assertEquals("13579BDF01234567", test.solution(16, 16, 2, 2));
    }
}
