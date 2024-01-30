package io.github.gsmet.playground.module3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Module3Test2Test {

    @Test
    public void testSuccess1() {
        assertTrue(true);
    }

    @Test
    public void testSuccess2() {
        assertTrue(new Random().nextInt(3) % 2 == 0);
    }
}
