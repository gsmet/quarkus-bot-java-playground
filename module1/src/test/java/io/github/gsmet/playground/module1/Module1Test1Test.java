package io.github.gsmet.playground.module1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Module1Test1Test {

    @Test
    public void testFailure() {
        System.out.println("move line");
        System.out.println("move line");
        System.out.println("move line");
        fail();
    }

    @Test
    public void testSuccess() {
        assertTrue(true);
    }
}
