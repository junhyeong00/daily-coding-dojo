import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTest {
    Count test;

    @BeforeEach
    void setup() {
        test = new Count();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution("3141592", "271"));
        assertEquals(8, test.solution("500220839878", "7"));
        assertEquals(3, test.solution("10203", "15"));
    }
}
