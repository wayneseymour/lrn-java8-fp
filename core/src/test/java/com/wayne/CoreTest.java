package com.wayne;

import org.junit.Test;

import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class CoreTest {
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
    @Test
    public void listMutation () {
      List<Integer> l = asList(1, 2, 3);
      assertEquals(impureAppend(4, l), "");
    }
    public List<Integer> impureAppend (int i, List<Integer> xi) {
      xi.add(i);
      return xi;
    }
}
