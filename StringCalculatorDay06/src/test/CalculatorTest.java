package test;

import static org.junit.Assert.*;

import main.Calculator;

import org.junit.Test;

public class CalculatorTest {


	@Test
	public void testReturnOfEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
}