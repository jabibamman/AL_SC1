package com.example.al_intro;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ConditionsTest {
    @Test(expected = IllegalArgumentException.class)
    public void testCalculatriceWithUnknownOperator() {
        Conditions.Calculatrice(2, 3, '!');
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculatriceWithDivisionByZero() {
        Conditions.Calculatrice(1, 0, '/');
    }

    @Test
    public void testCalculatriceWithDivisionByZero2() {
        assertEquals(0, Conditions.Calculatrice(0, 2, '/'), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculatriceWithDivisionByZero3() {
        Conditions.Calculatrice(0, 0, '/');
    }

    @Test
    public void testCalculatriceWithDivisionBy3and1() {
        assertEquals(3, Conditions.Calculatrice(3, 1, '/') , 0);
    }

    @Test
    public void testCalculatriceWithSum() {
        assertEquals(5, Conditions.Calculatrice(2, 3, '+'), 0);
    }

    @Test
    public void testCalculatriceWithSub() {
        assertEquals(-1, Conditions.Calculatrice(2, 3, '-') , 0);
    }

    @Test
    public void testCalculatriceWithMul() {
        assertEquals(6, Conditions.Calculatrice(2, 3, 'x'), 0);
    }

    @Test
    public void testCalculatriceWithDiv() {
        assertEquals(2.5, Conditions.Calculatrice(5, 2, '/') , 0);
    }

    @Test
    public void testCalculatriceWithPow() {
        assertEquals(8, Conditions.Calculatrice(2, 3, '^'), 0);
    }

}
