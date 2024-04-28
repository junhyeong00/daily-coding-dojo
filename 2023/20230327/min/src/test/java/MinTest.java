import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinTest {
    private Min test;

    @BeforeEach
    void setup() {
        test = new Min();
    }

    @Test
    void solution() {
        assertEquals(29, test.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
        assertEquals(10, test.solution(new int[] {1,2}, new int[] {3,4}));
    }
}
