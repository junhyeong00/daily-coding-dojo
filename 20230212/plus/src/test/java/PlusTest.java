import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusTest {
    @Test
    void solution() {
        Plus test = new Plus();

        assertEquals(new int[] {2,3,4,5,6,7}, test.solution(new int[] {2,1,3,4,1}));
        assertEquals(new int[] {2,5,7,9,12}, test.solution(new int[] {5,0,2,7}));
    }
}
