package uk.ac.belfastmet.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RorBTest {

	@Test
	void testSeeColor1() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("red");
		
		assertEquals("red", result);
	}
	
	@Test
	void testSeeColor2() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("redr");
		
		assertEquals("red", result);
	}
	
	@Test
	void testSeeColor3() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("rred");
		
		assertEquals("", result);
	}
	
	@Test
	void testSeeColor4() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("blue");
		
		assertEquals("blue", result);
	}
	
	@Test
	void testSeeColor5() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("blueb");
		
		assertEquals("blue", result);
	}
	
	@Test
	void testSeeColor6() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("bblue");
		
		assertEquals("", result);
	}
	
	@Test
	void testSeeColor7() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("random");
		
		assertEquals("", result);
	}
	
	@Test
	void testSeeColor8() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("redxx");
		
		assertEquals("red", result);
	}
	
	@Test
	void testSeeColor9() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("xxred");
		
		assertEquals("", result);
	}
	
	@Test
	void testSeeColor10() {
		RorB rorb = new RorB();
		String result = rorb.seeColor("blueTimes");
		
		assertEquals("blue", result);
	}

}
