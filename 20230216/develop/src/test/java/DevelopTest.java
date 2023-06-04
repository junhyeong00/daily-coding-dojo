import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- 첫 번째 작업이 100%가 되는 날짜 계산 -> n일
//- n일 후 작업의 진도율을 구하기
//- 요소를 삭제 (큐)
//- 배포마다 작업의 수 계산 -> 반복

class DevelopTest {
    Develop develop;

    @BeforeEach
    void setup() {
        develop = new Develop();
    }

    @Test
    void getCompletionDate() {
        assertEquals(12, develop.getCompletionDate(40, 5));
        assertEquals(6, develop.getCompletionDate(40, 10));
        assertEquals(5, develop.getCompletionDate(90, 2));
        assertEquals(4, develop.getCompletionDate(90, 3));
    }

    @Test
    void getProgress() {
        assertEquals(50, develop.getProgress(40, 5, 2));
        assertEquals(60, develop.getProgress(40, 10, 2));
        assertEquals(96, develop.getProgress(90, 2, 3));
        assertEquals(99, develop.getProgress(90, 3, 3));
    }

    @Test
    void solution() {
        assertArrayEquals(new int[]{2, 1},
                develop.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));

        assertArrayEquals(new int[]{1, 3, 2},
                develop.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }
}
