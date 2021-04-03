package io.github.gsmet.playground.module1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Module1Test2Test {

    @Test
    public void testFailure() {
        fail();
    }

    @Test
    public void testSuccess() {
        assertTrue(true);
    }
}
