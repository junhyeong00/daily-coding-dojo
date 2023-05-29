import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTest {
    @Test
    void solution() {
        Remove test = new Remove();

        assertEquals(1, test.solution("baabaa"));
        assertEquals(0, test.solution("cdcd"));
    }
}
