import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryCompetitionTest {
    @Test
    void solution() {
        ArcheryCompetition test = new ArcheryCompetition();

        assertEquals(test.solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}),
                new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0});
        assertEquals(test.solution(1, new int[]{1,0,0,0,0,0,0,0,0,0,0}),
                new int[]{-1});
    }
}
