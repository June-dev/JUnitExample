package com.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculator.Calculator;

class CalculatorTest {

	@Test
	void testMultiple() {
//		fail("Not yet implemented");
		Calculator calculator = new Calculator();
		assertEquals(560, calculator.multiple(7, 8));
	}

}
