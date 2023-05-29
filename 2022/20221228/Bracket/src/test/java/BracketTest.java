import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {
    @Test
    void solution() {
        Bracket test = new Bracket();

        assertEquals(3, test.solution(8, 4, 7));
    }

    @Test
    void calcNextNumber() {
        Bracket test = new Bracket();

        assertEquals(4, test.calcNextNumber(8));
        assertEquals(4, test.calcNextNumber(7));
        assertEquals(2, test.calcNextNumber(4));
    }
}
