import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

//- 접두어인지 판별하는 메서드 (접두어, 비교할 대상) -> 길이가 접두어보다 길경우에만

class PhoneBookTest {
    PhoneBook phoneBook;

    @BeforeEach
    void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    void hash() {
        assertEquals(Objects.hash("hi"), Objects.hash("hi"));
    }

    @Test
    void isPrefix() {
        assertFalse(phoneBook.isPrefix("119", "97674223"));
        assertTrue(phoneBook.isPrefix("119", "1197674223"));
        assertFalse(phoneBook.isPrefix("12", "976723"));
        assertTrue(phoneBook.isPrefix("12", "123"));
    }

    @Test
    void solution() {
        assertFalse(phoneBook.solution(new String[]{"119", "97674223", "1195524421"}));
        assertTrue(phoneBook.solution(new String[]{"123", "456", "789"}));
        assertFalse(phoneBook.solution(new String[]{"12", "123", "1235", "567", "88"}));
    }
}
