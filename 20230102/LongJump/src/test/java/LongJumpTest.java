import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongJumpTest {
    @Test
    void solution() {
        LongJump test = new LongJump();

        assertEquals(4, test.solution(5));
        assertEquals(3, test.solution(3));
    }
}