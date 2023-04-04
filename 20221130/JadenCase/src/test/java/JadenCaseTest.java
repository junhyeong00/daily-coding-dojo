import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {
    @Test
    void solution() {
        JadenCase test = new JadenCase();

        assertEquals("3people Unfollowed Me", test.solution("3people unFollowed me"));
        assertEquals("For The Last Week", test.solution("for the last week"));
        assertEquals("For The  Last Week", test.solution("for the  last week"));
        assertEquals(" For The Last Week ", test.solution(" for the last week "));
    }

    @Test
    void changeJadenCase() {
        JadenCase test = new JadenCase();

        assertEquals("3people", test.changeJadenCase("3people"));
        assertEquals("3peo3le", test.changeJadenCase("3peo3le"));
        assertEquals("Unfollowed", test.changeJadenCase("unFollowed"));
        assertEquals("Me", test.changeJadenCase("me"));
    }
}
