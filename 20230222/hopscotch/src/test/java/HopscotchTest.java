import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//- for문을 이용해 모든 경우의 수를 구한다
//- 4개중에 하나를 고른다
//- 그 다음 바로 밑의 수를 제외한 3개의 숫자를 고른다 (끝날때까지) (인자 : 현재 선택한 인덱스, 다음 라운드 배열) -> 최댓값 리턴


class HopscotchTest {
    Hopscotch hopscotch;

    @BeforeEach
    void setup() {
        hopscotch = new Hopscotch();
    }

    @Test
    void solution() {
        assertEquals(16, hopscotch.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}}));
    }
}
