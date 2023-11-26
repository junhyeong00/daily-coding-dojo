import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main test;

    @BeforeEach
    void setUp() {
        test = new Main();
    }

    @Test
    void isGoodSequence() {
        assertFalse(test.isGoodSequence("1212"));
        assertTrue(test.isGoodSequence("121"));
        assertTrue(test.isGoodSequence("1213"));
    }
}
