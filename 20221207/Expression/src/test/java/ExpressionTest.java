import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void solution() {
        Expression test = new Expression();

        assertEquals(4, test.solution(15));
    }

    @Test
    void validate() {
        Expression test = new Expression();

        assertTrue(test.validate(1, 15));
        assertTrue(test.validate(4, 15));
        assertTrue(test.validate(7, 15));
        assertTrue(test.validate(15, 15));
        assertFalse(test.validate(2, 15));
        assertFalse(test.validate(3, 15));
    }
}
