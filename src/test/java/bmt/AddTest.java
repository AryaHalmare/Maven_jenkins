package bmt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTest {

    @Test
    public void testAdd() {
        int result1 = Add.add(10, 20);
        int result2 = Add.add(20, 20);
        int result3 = Add.add(30, 20);

        assertEquals(30, result1);
        assertEquals(40, result2);
        assertEquals(50, result3);
    }
}
