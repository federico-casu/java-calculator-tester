package org.learning.calculator;

public class Calculator {

    // ATTRIBUTES


    // CONSTRUCTORS


    // METHODS
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float divide(float num1, float num2) throws IllegalArgumentException {
        if (num1 == 0 && num2 == 0) {
            throw new IllegalArgumentException("Impossible");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Infinite");
        }
        return num1 / num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
