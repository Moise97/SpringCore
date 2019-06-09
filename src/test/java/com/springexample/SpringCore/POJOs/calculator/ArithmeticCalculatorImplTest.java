package com.springexample.SpringCore.POJOs.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticCalculatorImplTest {

    ArithmeticCalculatorImpl victim = new ArithmeticCalculatorImpl();

    @Test
    public void add() {
        assertEquals(5, victim.add(2.37, 2.63), 0.01);
    }

    @Test
    public void sub() {
        assertEquals(5, victim.sub(7.5, 2.5), 0.01);
    }

    @Test
    public void mul() {
        assertEquals(27.2, victim.mul(9.01, 3.02), 0.02);
    }

    @Test
    public void div() {
        assertEquals(10.5, victim.div(22.11, 2.1), 0.03);
    }
}