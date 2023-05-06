import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {
    @Test
    void solution() {
        Index test = new Index();

        assertEquals(3, test.solution(new int[]{3, 0, 6, 1, 5}));
    }
}
