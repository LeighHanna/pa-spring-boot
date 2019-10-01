package uk.ac.belfastmet.examples.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void testIcyHot() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(-1, 101);
		
		assertEquals(true, result);
	}
	
	@Test
	public void testIcyHot2() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(101, -1);
		
		assertEquals(true, result);
	}
	
	@Test
	public void testIcyHot3() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(-1, 100);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testIcyHot4() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(0, 100);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testIcyHot5() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(101, 101);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testIcyHot6() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(0, 101);
		
		assertEquals(false, result);
	}
	
	@Test
	public void testIcyHot7() {
		Temperature temp = new Temperature();
		
		Boolean result = temp.icyHot(-1, -1);
		
		assertEquals(false, result);
	}

}
