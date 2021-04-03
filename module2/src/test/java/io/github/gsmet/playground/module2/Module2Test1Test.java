package io.github.gsmet.playground.module2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Module2Test1Test {

    @Test
    public void testFailure() {
        fail();
    }

    @Test
    public void testSuccess() {
        assertTrue(true);
    }
}
