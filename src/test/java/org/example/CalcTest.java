package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test
    void testAdd() {
        Calc calc = new Calc();
        assertEquals(3, calc.add(1,2));
    }

    // 这个是故意失败的测试
    @Test
    void testSubFail() {
        Calc calc = new Calc();
        assertEquals(5, calc.sub(10,7));
    }
}
