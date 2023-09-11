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
        assertArrayEquals(test.solution("banana"), new int[]{-1, -1, -1, 2, 2, 2});
        assertArrayEquals(test.solution("foobar"), new int[]{-1, -1, 1, -1, -1, -1});
    }
}
