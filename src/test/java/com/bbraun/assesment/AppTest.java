package com.bbraun.assesment;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for App.
 */
public class AppTest {

    @Test
    public void testParseArgs() {
        App app = new App();
        String[] args = { "5" };
        int result = app.parseArgs(args);
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseArgsInvalidNumber() {
        App app = new App();
        String[] args = { "abc" };
        app.parseArgs(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseArgsMissingArgument() {
        App app = new App();
        String[] args = {};
        app.parseArgs(args);
    }
}
