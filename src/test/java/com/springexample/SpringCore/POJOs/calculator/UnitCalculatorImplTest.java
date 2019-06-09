package com.springexample.SpringCore.POJOs.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitCalculatorImplTest {

    private UnitCalculatorImpl victim = new UnitCalculatorImpl();

    @Test
    public void kilogramToPound() {
        assertEquals(15.4, victim.kilogramToPound(7), 0.01);
    }

    @Test
    public void kilometerToMile() {
        assertEquals(1.24, victim.kilometerToMile(2), 0.01);
    }
}