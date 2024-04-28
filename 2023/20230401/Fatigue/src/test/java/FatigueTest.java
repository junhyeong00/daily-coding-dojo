import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatigueTest {
    private Fatigue test;

    @BeforeEach
    void setup() {
        test = new Fatigue();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}
