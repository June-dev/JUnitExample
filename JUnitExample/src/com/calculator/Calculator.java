package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Calculator {
	public int multiple (int num1, int num2) {
		return num1 * num2;
	}
	
	@Test
	public void testMultiple() throws Exception{
		try{
			
			Calculator calculator = new Calculator();
			assertEquals(56, calculator.multiple(7, 8));
//			assertEquals(560, calculator.multiple(7, 8));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
