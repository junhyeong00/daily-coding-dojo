import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {
    @Test
    void solution() {
        Print test = new Print();

        assertEquals(1, test.solution(new int[]{2, 1, 3, 2}, 2));
        assertEquals(5, test.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
