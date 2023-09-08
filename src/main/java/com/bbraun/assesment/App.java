package com.bbraun.assesment;

/**
 * Calculates the nth Fibonacci number.
 */
public class App {

    private static final String USAGE_HINT = "Usage: java com.bbraun.assesment.App <num>";

    /**
     * Parses the command line arguments.
     * 
     * @param args the command line arguments
     * 
     * @return the number to calculate the Fibonacci number for
     * 
     * @throws IllegalArgumentException if the command line arguments are invalid
     */
    protected int parseArgs(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Missing argument");
        }

        try {
            return Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format");
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Runs the application. Extracted from main() for testability.
     * 
     * @param args the command line arguments
     */
    private void run(String[] args) {
        try {
            Integer n = parseArgs(args);
            System.out.println(String.format("The %sth Fibonaccy number is: %s", n, Fibonacci.fibonacci(n)));
        } catch (IllegalArgumentException e) {
            System.out.println(USAGE_HINT);
            System.exit(1);
        }
    }

    /**
     * Runs the application.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final App app = new App();
        app.run(args);
    }
}
