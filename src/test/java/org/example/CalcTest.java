package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(3, calc.add(1,2));
    }

    @Test
public void testSubFail() {
    Calc calc = new Calc();
    assertEquals(3, calc.sub(10,7));
}

}
