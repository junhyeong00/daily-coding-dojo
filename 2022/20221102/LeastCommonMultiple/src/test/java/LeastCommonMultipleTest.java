import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {
    @Test
    void solution() {
        LeastCommonMultiple test = new LeastCommonMultiple();
        assertEquals(168, test.solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, test.solution(new int[]{1, 2, 3}));
        assertEquals(3, test.solution(new int[]{3}));
    }

    @Test
    void calcLeastCommonMultiple() {
        LeastCommonMultiple test = new LeastCommonMultiple();
        assertEquals(2, test.calcLeastCommonMultiple(1, 2));
        assertEquals(6, test.calcLeastCommonMultiple(2, 3));
    }

    @Test
    void calcGreatestCommonDivisor() {
        LeastCommonMultiple test = new LeastCommonMultiple();
        assertEquals(1, test.calcGreatestCommonDivisor(1, 2));
        assertEquals(2, test.calcGreatestCommonDivisor(2, 6));
    }
}
