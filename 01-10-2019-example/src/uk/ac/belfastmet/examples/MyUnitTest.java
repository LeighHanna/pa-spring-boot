package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}
	
	@Test
	public void testConcatenateLong() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("This should be the story of my life:", " boring");
		
		assertEquals("This should be the story of my life: boring", result);
	}
	
	@Test
	public void testConcatenateNumber() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("3", " 1");
		
		assertEquals("3 1", result);
	}
	
	@Test
	public void testConcatenateNumberFalseCase() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("3", " 1");
		
		assertNotEquals("31", result);
	}

}
