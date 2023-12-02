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
        assertEquals(10, test.solution(5, 3, 2));
        assertEquals(21, test.solution(10, 3, 2));
    }

    @Test
    void calcNumberOfDivisors() {
        assertEquals(1, test.calcNumberOfDivisors(1));
        assertEquals(2, test.calcNumberOfDivisors(2));
        assertEquals(2, test.calcNumberOfDivisors(3));
        assertEquals(3, test.calcNumberOfDivisors(4));
        assertEquals(2, test.calcNumberOfDivisors(5));
    }
}
