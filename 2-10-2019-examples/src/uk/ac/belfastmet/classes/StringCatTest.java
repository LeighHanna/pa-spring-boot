package uk.ac.belfastmet.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void testConcatinate() {
		String result  = StringCat.concatinate("Leigh ", "Hanna");
		
		assertEquals("Leigh Hanna", result);
	}

}
