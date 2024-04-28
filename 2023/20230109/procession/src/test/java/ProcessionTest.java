import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessionTest {
    @Test
    void solution() {
        Procession procession = new Procession();

        assertArrayEquals(new int[][]{{15, 15}, {15, 15}, {15, 15}},
                procession.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}));
    }
}
