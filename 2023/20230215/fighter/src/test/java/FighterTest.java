import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 각 자리수를 짝수로 만들기 (입력 : 7 -> 출력: 6)
//- 절반을 순서대로 배치하기
//- 0 배치
//- 나머지 절반 역순으로 배치

class FighterTest {
    Fighter test;

    @BeforeEach
    void setup() {
        test = new Fighter();
    }

    @Test
    void toOddNumber() {
        assertEquals(6, test.toOddNumber(7));
        assertEquals(4, test.toOddNumber(4));
        assertEquals(10, test.toOddNumber(11));
    }

    @Test
    void getHalf() {
        assertEquals("122", test.getHalf(new int[]{1, 2, 4, 0}));
        assertEquals("1233", test.getHalf(new int[]{1, 2, 2, 4}));
        assertEquals("2333", test.getHalf(new int[]{1, 1, 3, 6}));
    }

    @Test
    void solution() {
        assertEquals("1223330333221", test.solution(new int[]{1, 3, 4, 6}));
        assertEquals("111303111", test.solution(new int[]{1, 7, 1, 2}));
    }
}
