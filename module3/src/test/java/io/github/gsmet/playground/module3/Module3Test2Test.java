package io.github.gsmet.playground.module3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Module3Test2Test {

    private static final Random RANDOM = new Random();

    @Test
    public void testSuccess1() {
        assertTrue(true);
    }

    @Test
    public void testSuccess2() {
        assertTrue(RANDOM.nextInt(2) % 2 == 0);
    }

    @Test
    public void testSuccess3() {
        assertTrue(RANDOM.nextInt(2) % 2 == 0);
    }

    @Test
    public void testSuccess4() {
        assertTrue(RANDOM.nextInt(2) % 2 == 0);
    }
}
