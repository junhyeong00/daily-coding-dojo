import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {
    @Test
    void solution() {
        Queen test = new Queen();

        assertEquals(2, test.solution(4));
    }
}
