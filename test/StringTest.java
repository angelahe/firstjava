import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringTest {

    @Test
    void stringLengthTest() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }
    @Test
    void stringLengthFailTest() {
        int actualLength = "ABCDE".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);
    }
}

