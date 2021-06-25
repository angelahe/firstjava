import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {

    @Test
    void reverse() {
        StringReverser reverser = new StringReverser();
        assertEquals("thgislarulP", reverser.reverse("Pluralsight"));
    }
}