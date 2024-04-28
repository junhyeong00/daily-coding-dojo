import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {
    @Test
    void solution() {
        TargetNumber targetNumber = new TargetNumber();

        assertEquals(5, targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3));

        targetNumber = new TargetNumber();

        assertEquals(2, targetNumber.solution(new int[]{4, 1, 2, 1}, 4));
    }
}
