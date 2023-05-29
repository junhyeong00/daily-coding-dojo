import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextNumberTest {
    @Test
    void solution() {
        NextNumber test = new NextNumber();

        assertEquals(83, test.solution(78));
        assertEquals(23, test.solution(15));
    }
}
