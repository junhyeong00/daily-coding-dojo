import org.junit.jupiter.api.Test;

import javax.sound.sampled.Port;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void solution() {
        Point test = new Point();

        assertEquals(6, test.solution(2, 4));
        assertEquals(26, test.solution(1, 5));
    }
}