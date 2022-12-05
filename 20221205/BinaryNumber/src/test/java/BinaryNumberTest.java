import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {
    @Test
    void solution() {
        BinaryNumber test = new BinaryNumber();

        assertArrayEquals(new int[]{3,8},test.solution("110010101001"));
        assertArrayEquals(new int[]{3,3},test.solution("01110"));
        assertArrayEquals(new int[]{4,1},test.solution("1111111"));
    }

    @Test
    void removeZero() {
        BinaryNumber test = new BinaryNumber();

        assertEquals("1111", test.removeZero("0111010"));
        assertEquals("111", test.removeZero("01110"));
        assertEquals("111", test.removeZero("11100"));
    }

    @Test
    void toBinaryNumber() {
        BinaryNumber test = new BinaryNumber();

        assertEquals("11", test.toBinaryNumber(3));
    }
}
