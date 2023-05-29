import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeyPadTest {
    @Test
    void solution() {
        KeyPad test = new KeyPad();

        assertEquals("LRLLLRLLRRL", test.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        assertEquals("LRLLRRLLLRR", test.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        assertEquals("LLRLLRLLRL", test.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    @Test
    void getPressedHand() {
        KeyPad test = new KeyPad();

        assertEquals("L", test.getPressedHand(1, "right", 11, 12));
        assertEquals("R", test.getPressedHand(3, "right", 1, 12));
        assertEquals("L", test.getPressedHand(4, "right", 1, 3));
        assertEquals("L", test.getPressedHand(5, "right", 4, 3));
        assertEquals("L", test.getPressedHand(8, "right", 5, 3));
        assertEquals("R", test.getPressedHand(2, "right", 8, 3));
        assertEquals("L", test.getPressedHand(1, "right", 8, 2));
        assertEquals("L", test.getPressedHand(4, "right", 1, 2));
        assertEquals("R", test.getPressedHand(5, "right", 4, 2));
        assertEquals("R", test.getPressedHand(9, "right", 4, 5));
        assertEquals("L", test.getPressedHand(5, "right", 4, 9));
    }
}
