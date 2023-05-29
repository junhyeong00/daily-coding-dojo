import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAndMinTest {
    @Test
    void MaxAndMin() {
        MaxAndMin test = new MaxAndMin();

        assertEquals(test.solution("1 2 3 4"), "1 4");
        assertEquals(test.solution("-1 -2 -3 -4"), "-4 -1");
        assertEquals(test.solution("-1 -1"), "-1 -1");
    }
}
