package org.example.junitExample;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    Calculator c = new Calculator();

    public void testAdd() {
        assertEquals(9,c.add(4,5));
    }

    public void testSub() {
        assertEquals(5, c.sub(10,5));
    }

    public void testMultiply() {
        assertEquals(1000, c.multiply(100,100));
    }

    public void testDivision() {
        assertEquals(5, c.division(50,10));
    }
}