package uk.ac.belfastmet.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingsTest {

	@Test
	public void helloNameTest1() {
		String result = Greetings.helloName("Bob");
		
		assertEquals("Hello Bob!", result);
	}

	@Test
	public void helloNameTest2() {
		String result = Greetings.helloName("Alice");
		
		assertEquals("Hello Alice!", result);
	}
	
	@Test
	public void helloNameTest3() {
		String result = Greetings.helloName("X");
		
		assertEquals("Hello X!", result);
	}
}
