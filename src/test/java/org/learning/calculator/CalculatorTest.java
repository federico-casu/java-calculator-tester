package org.learning.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(3.0f, 2.0f));
        assertEquals(4.3f, Calculator.add(3.1f, 1.2f));
        assertEquals(-1.9, Calculator.add(-3.1f, 1.2f), 0.0000005);
        assertEquals(0.7, Calculator.add(-0.6f,1.3f), 0.0000005);
        assertEquals(0.0f, Calculator.add(0.0f,0.0f));
    }

    @Test
    void subtract() {
        assertEquals(2, Calculator.subtract(5, 3));
        assertEquals(3.1f, Calculator.subtract(4.3f, 1.2f), 0.0000005);
        assertEquals(-3.1f, Calculator.subtract(-1.9f, 1.2f), 0.0000005);
        assertEquals(0.5f, Calculator.subtract(1.7f, 1.2f), 0.0000005);
        assertEquals(0.0f, Calculator.subtract(0.0f, 0.0f));
    }

    @Test
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(0.0f, 0.0f));
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1.3f, 0.0f));
        assertEquals(0.0f, Calculator.divide(0.0f, 1.3f));
        assertEquals(5.0f, Calculator.divide(7.5f, 1.5f));
        assertEquals(-5.0f, Calculator.divide(7.5f, -1.5f));
    }

    @Test
    void multiply() {
        assertEquals(0.0f, Calculator.multiply(0.0f, 47.5342f));
        assertEquals(0.0f, Calculator.multiply(47.5342f, 0.0f));
        assertEquals(7.5f, Calculator.multiply(2.5f, 3.0f));
    }
}