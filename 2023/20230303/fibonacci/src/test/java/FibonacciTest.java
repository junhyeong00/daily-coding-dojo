import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci test;

    @BeforeEach
    void setup() {
        test = new Fibonacci();
    }

    @Test
    void solution() {
        assertEquals(2, test.solution(3));
        assertEquals(5, test.solution(5));
    }

    @Test
    void getFibonacciNumber() {
        assertEquals(0 + 1, test.getFibonacciNumber(2));
        assertEquals(1 + 1, test.getFibonacciNumber(3));
        assertEquals(1 + 2, test.getFibonacciNumber(4));
        assertEquals(2 + 3, test.getFibonacciNumber(5));
    }
}
