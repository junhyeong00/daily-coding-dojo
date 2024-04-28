import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MandarinTest {
    Mandarin test;

    @BeforeEach
    void setup() {
        test = new Mandarin();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(2, test.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(1, test.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
