import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {
    private Basic test;

    @BeforeEach
    void setup() {
        test = new Basic();
    }

    @Test
    void solution() {
        assertFalse(test.solution("a234"));
        assertTrue(test.solution("1234"));
    }

    @Test
    void isCorrectLength() {
        assertFalse(test.isCorrectLength("22342"));
        assertTrue(test.isCorrectLength("1234"));
        assertTrue(test.isCorrectLength("123432"));
    }

    @Test
    void isAllNumber() {
        assertFalse(test.isAllNumber("22342s"));
        assertTrue(test.isAllNumber("1234"));
        assertTrue(test.isAllNumber("123432"));
    }
}
