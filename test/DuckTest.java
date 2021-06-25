
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    @Test
    void getName() {
        Duck duck = new Duck( "Ducky");
        assertEquals("Ducky", duck.getName());
    }
}