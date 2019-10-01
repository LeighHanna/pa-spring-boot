package uk.ac.belfastmet.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MidStringTest {

	@Test
	void testMiddleTwo1() {
		MidString myExample = new MidString();
		String result = myExample.middleTwo("2233");
		
		assertEquals("23",result);
	}
	
	@Test
	void testMiddleTwo2() {
		MidString myExample = new MidString();
		String result = myExample.middleTwo("LeighHanna");
		
		assertEquals("hH",result);
	}
	
	@Test
	void testMiddleTwo3() {
		MidString myExample = new MidString();
		String result = myExample.middleTwo("this is a long sentance but it will show more variety but as it is odd nothing will show to you");
		
		assertEquals("",result);
	}
	
	@Test
	void testMiddleTwo4() {
		MidString myExample = new MidString();
		String result = myExample.middleTwo("this is a long sentance but it will show more variety yet even as it is odd it will show you a value");
		
		assertEquals("ie",result);
	}
	
	@Test
	void testMiddleTwo5() {
		MidString myExample = new MidString();
		String result = myExample.middleTwo(" @ @ @@ @ @ ");
		
		assertEquals("@@",result);
	}

}
