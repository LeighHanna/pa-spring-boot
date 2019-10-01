package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontAndBackTest {

	@Test
	public void testIsPalindrome1() {
		FrontAndBack myExample = new FrontAndBack();
		Boolean result = myExample.isPalindrome("leiel");
		
		assertTrue(result);
	}
	
	@Test
	public void testIsPalindrome2() {
		FrontAndBack myExample = new FrontAndBack();
		Boolean result = myExample.isPalindrome("hannah");
		
		assertTrue(result);
	}
	
	@Test
	public void testIsPalindrome3() {
		FrontAndBack myExample = new FrontAndBack();
		Boolean result = myExample.isPalindrome("martin");
		
		assertFalse(result);
	}
	
	@Test
	public void testIsPalindrome4() {
		FrontAndBack myExample = new FrontAndBack();
		Boolean result = myExample.isPalindrome("leigh");
		
		assertFalse(result);
	}

}
