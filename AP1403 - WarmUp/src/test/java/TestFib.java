import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFib {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testFib0() {
        assertEquals(5, ex.fibonacciIndex(5));
    }

    @Test
    void testFib1() {
        assertEquals(-1, ex.fibonacciIndex(15));
    }

    @Test
    void testFib2() {
        assertEquals(16, ex.fibonacciIndex(987));
    }

    @Test
    void testFib3() {
            assertEquals(34, ex.fibonacciIndex(5702887));
    }
}
