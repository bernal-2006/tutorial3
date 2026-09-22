package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2,3));
    }

    // 新增这个减法测试！
    @Test
    public void testSubtraction() {
        Calc calc = new Calc();
        assertEquals(2, calc.subtract(4,2));
    }
}
