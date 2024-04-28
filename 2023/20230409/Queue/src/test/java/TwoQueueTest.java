import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoQueueTest {
    @Test
    void solution() {
        TwoQueue test = new TwoQueue();

        assertEquals(2, test.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1}));
        assertEquals(7, test.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2}));
        assertEquals(-1, test.solution(new int[]{1, 1}, new int[]{1, 5}));
    }
}
