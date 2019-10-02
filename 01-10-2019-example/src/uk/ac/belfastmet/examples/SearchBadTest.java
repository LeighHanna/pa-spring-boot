package uk.ac.belfastmet.examples;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchBadTest {

	//Javadoc comments for test methods
	@Test
	void testHasBad1() {
		SearchBad searchBad = new SearchBad();
		Boolean result = searchBad.hasBad("badxx");
		
		assertTrue(result);
	}
	
	@Test
	void testHasBad2() {
		SearchBad searchBad = new SearchBad();
		Boolean result = searchBad.hasBad("xbadxx");
		
		assertTrue(result);
	}
	
	@Test
	void testHasBad3() {
		SearchBad searchBad = new SearchBad();
		Boolean result = searchBad.hasBad("xxbadxx");
		
		assertFalse(result);
	}
	
	@Test
	void testHasBad4() {
		SearchBad searchBad = new SearchBad();
		Boolean result = searchBad.hasBad("xxdabxx");
		
		assertFalse(result);
	}
	
	@Test
	void testHasBad5() {
		SearchBad searchBad = new SearchBad();
		Boolean result = searchBad.hasBad("badabxx");
		
		assertTrue(result);
	}



}
