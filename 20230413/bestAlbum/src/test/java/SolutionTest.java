import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution test;

    @BeforeEach
    void setup() {
        test = new Solution();
    }

    @Test
    void solution() {
        assertArrayEquals(
                new int[]{4,1,3,0},
                test.solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
    }

    @Test
    void getOrdered() {
        assertEquals(
                List.of("pop", "classic"),
                test.getOrdered(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})
        );
    }
}
