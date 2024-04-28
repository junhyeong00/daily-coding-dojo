import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpicyTest {
    @Test
    void solution() {
        Spicy test = new Spicy();

        assertEquals(2, test.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
