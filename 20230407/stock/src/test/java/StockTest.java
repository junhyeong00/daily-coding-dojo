import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    @Test
    void solution() {
        Stock test = new Stock();
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, test.solution(new int[]{1, 2, 3, 2, 3}));
    }
}
