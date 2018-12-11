package com.wayne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void testListMutationAsArrayList () {
      // TODO: Assert what occurs when a different impl is passed, like a List vs ArrayList vs ?Set.
      List<Integer> xn  = new ArrayList<>(asList(1, 2, 3));
      assertEquals(3, xn.size());
      impureAppend(99, xn);
      assertEquals(4, xn.size());
//      xn.forEach(x -> System.out.println("\n\t### x: " + x)); // Dump vars.
    }
    public static List<Integer> impureAppend (int i, List<Integer> xi) {
      xi.add(i);
      return xi;
    }
}
