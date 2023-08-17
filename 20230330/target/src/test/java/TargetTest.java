import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetTest {
    private Target test;

    @BeforeEach
    void setup() {
        test = new Target();
    }

    @Test
    void solution() {
        assertEquals(5, test.solution(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(2, test.solution(new int[]{4, 1, 2, 1}, 4));
    }
}