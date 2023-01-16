import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotationTest {
    @Test
    void solution() {
        Rotation test = new Rotation();

        assertEquals(3, test.solution("[](){}"));
        assertEquals(2, test.solution("}]()[{"));
        assertEquals(0, test.solution("[)(]"));
        assertEquals(0, test.solution("}}}"));
    }

    @Test
    void validate() {
        Rotation test = new Rotation();

        assertTrue(test.validate("[]"));
    }
}
