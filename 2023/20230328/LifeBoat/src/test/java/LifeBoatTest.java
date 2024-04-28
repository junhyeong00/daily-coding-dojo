import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeBoatTest {
    private LifeBoat test;

    @BeforeEach
    void setup() {
        test = new LifeBoat();
    }

    @Test
    void solution() {
        assertEquals(3, test.solution(new int[] {70, 50, 80, 50}, 100));
        assertEquals(3, test.solution(new int[] {70, 80, 50}, 100));
    }
}
