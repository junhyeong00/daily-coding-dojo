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
        assertEquals(1, test.solution(new String[] {"aya", "yee", "u", "maa"}));
        assertEquals(2, test.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    @Test
    void checkPossibleBabbling() {
        assertTrue(test.checkPossibleBabbling("aya"));
        assertFalse(test.checkPossibleBabbling("yee"));
        assertFalse(test.checkPossibleBabbling("u"));
        assertFalse(test.checkPossibleBabbling("maa"));
    }
}
