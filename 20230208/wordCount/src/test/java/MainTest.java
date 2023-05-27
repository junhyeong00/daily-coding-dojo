import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void calcCount() {
        Main test = new Main();

        assertEquals(6, test.calcCount("The Curious Case of Benjamin Button"));

        assertEquals(6, test.calcCount(" The first character is a blank"));

        assertEquals(6, test.calcCount("The last character is a blank "));

        assertEquals(6, test.calcCount(" The last character is a blank "));
    }
}
