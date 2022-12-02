import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {
    @Test
    void solution() {
        Bracket test = new Bracket();

        assertTrue(test.solution("()()"));
        assertTrue(test.solution("()()"));
        assertFalse(test.solution(")()("));
        assertFalse(test.solution("(()("));
        assertFalse(test.solution("(()("));
        assertFalse(test.solution("())(()"));
    }
}
