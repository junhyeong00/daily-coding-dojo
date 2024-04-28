import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {
    private Carpet test;

    @BeforeEach
    void setup() {
        test = new Carpet();
    }

    @Test
    void solution() {
        assertArrayEquals(new int[] {4, 3}, test.solution(10, 2));
        assertArrayEquals(new int[] {3, 3}, test.solution(8, 1));
        assertArrayEquals(new int[] {8, 6}, test.solution(24, 24));
    }

    @Test
    void calcNecessaryYellow() {
        assertEquals(2, test.calcNecessaryYellow(10, 1));
    }
}
