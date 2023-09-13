import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution test;

    @BeforeEach
    void setUp() {
        test = new Solution();
    }

    @Test
    void solution() {
        assertEquals(8, test.solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
        assertEquals(33, test.solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    // 상태에 따라 1점부터 k점
    // 한 상자에 m개, 상자에 담긴 사과중 가장 낮은 점수 p, -> 한 상자의 가격 p * m
    // => 이 때, 얻을 수 있는 최대 이익은?

    // 1. 크기 순으로 정렬
    // 2. 담을 수 있는 개수만큼 차례로 삭제
    // 3. 가장 작은 점수를 이용하여 가격계산
    // 4. 가격합산
}
