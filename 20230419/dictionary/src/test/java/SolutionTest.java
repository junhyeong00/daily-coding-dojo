import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution test = new Solution();

        assertEquals(6, test.solution("AAAAE"));
        assertEquals(10, test.solution("AAAE"));
        assertEquals(1563, test.solution("I"));
        assertEquals(1189, test.solution("EIO"));
    }
}

// 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용하여 만들 수 있는, 길이 5 이하의 모든 단어가 수록
// 단어가 주어질 때, 사전에서 몇번째 단어인지를 반환해야한다.

//
// f(0) = 1
// f(1) = 1 + f(1) * 5 = 6
// f(2) = 1 + f(2) * 5 = 31
// f(3) = 1 + f(3) * 5 = 156
// f(4) = 1 + f(4) * 5 = 781
