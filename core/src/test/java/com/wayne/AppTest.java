package com.wayne;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void passByVal() {
      assertEquals(mult(2, 3), 10);
    }
    public int mult (int a, Integer b) {
        a = 5;
        b = 2;
        return a * b;
    }
}
