/*
 * Exercise 5
 * Repeat Exercise 1 and Exercise 2 using parameterised tests.
 */
package com.ait.ex5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class InvestmentValueTest {
//	private final int VALID_TERM = 4;
//	private final int VALID_INVESTMENT = 2000;

	InvestmentValue iv;

	@Before
	public void setup() {
		iv = new InvestmentValue();
	}

	@Parameters
	private static final Object[] getValidInvestmentAmounts() {
		return $($(1000, 3, 1061.21), $(1001, 4, 1083.51), $(2000, 5, 2208.16),

				$(2998, 6, 3376.23),
				// $(2999,6,3377.36),
				// $(2999,3,4098.947),
				$(2999, 3, 3471.717), $(4000, 2, 4410.0),

				$(5000, 3, 6125.215));
	}

	@Test
	@Parameters(method = "getValidInvestmentAmounts")
	public void testValidInvestmentAmounts(int investment, int term, double finalAmount) {
		assertEquals(finalAmount, InvestmentValue.calculateInvestmentValue(term, investment), 0.01);
	}
}
