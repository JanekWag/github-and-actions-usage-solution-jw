package com.bbraun.assesment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for Fibonacci.
 */
public class FibonacciTest {

    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
    }
}
