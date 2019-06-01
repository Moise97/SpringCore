package com.springexample.SpringCore.POJOs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SequenceGeneratorTest {

    private SequenceGenerator victim;

    @Before
    public void setup() {
        victim = new SequenceGenerator("a", "b", 1, 2);
    }

    @Test
    public void getPrefix() {
        assertNotNull(victim.getPrefix());
        assertEquals("a", victim.getPrefix());
    }

    @Test
    public void getSuffix() {
        assertNotNull(victim.getSuffix());
        assertEquals("b", victim.getSuffix());
    }

    @Test
    public void getInitial() {
        assertEquals(1, victim.getInitial());
    }

    @Test
    public void getCounter() {
        assertEquals(2, victim.getCounter());
    }

    @Test
    public void getSequence() {
        assertNotNull(victim.getSequence());
        assertEquals("a4b", victim.getSequence());
    }
}