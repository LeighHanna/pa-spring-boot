package uk.ac.belfastmet.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalanceTest {

	@Test
	public void testBalanceBrackets1() {
		String result = Balance.balanceBrackets("[()]");
		System.out.println(result);
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalanceBrackets2() {
		String result = Balance.balanceBrackets("{[]}");
		System.out.println(result);
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalanceBrackets3() {
		String result = Balance.balanceBrackets("[]{}()");
		System.out.println(result);
		assertEquals("Balanced", result);
	}
	
	@Test
	public void testBalanceBrackets4() {
		String result = Balance.balanceBrackets("[)[)");
		System.out.println(result);
		assertEquals("Not Balanced", result);
	}
	
	@Test
	public void testBalanceBrackets() {
		String result = Balance.balanceBrackets("()]()");
		System.out.println(result);
		assertEquals("Not Balanced", result);
	}

}
