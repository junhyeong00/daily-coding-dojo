import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution test = new Solution();

        assertEquals(2, test.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
