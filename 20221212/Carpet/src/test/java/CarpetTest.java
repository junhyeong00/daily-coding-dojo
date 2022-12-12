import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {
    @Test
    void solution() {
        Carpet test = new Carpet();

        assertArrayEquals(new int[]{4,3}, test.solution(10, 2));
        assertArrayEquals(new int[]{3,3}, test.solution(8, 1));
        assertArrayEquals(new int[]{8,6}, test.solution(24, 24));
    }

    @Test
    void calcNecessaryYellow() {
        Carpet test = new Carpet();

        assertEquals(2, test.calcNecessaryYellow(10, 1));
        assertEquals(1, test.calcNecessaryYellow(8, 1));
        assertEquals(24, test.calcNecessaryYellow(24, 4));
    }
}
