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
        assertArrayEquals(new int[]{3, 8}, test.solution("110010101001"));
        assertArrayEquals(new int[]{3, 3}, test.solution("01110"));
        assertArrayEquals(new int[]{4, 1}, test.solution("1111111"));
    }
}
