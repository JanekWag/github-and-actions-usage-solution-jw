package com.bbraun.assesment;

/**
 * Calculates the nth Fibonacci number.
 */
public class Fibonacci {

    /**
     * Calculates the nth Fibonacci number.
     * 
     * @param n the number to calculate the Fibonacci number for
     * 
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
