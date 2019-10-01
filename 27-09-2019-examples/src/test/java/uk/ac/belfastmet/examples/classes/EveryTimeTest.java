package uk.ac.belfastmet.examples.classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class EveryTimeTest {

	@Test
	public void testEveryNth1() {
		EveryTime eTime = new EveryTime();
		String result =eTime.everyNth("Miracle", 2);
		
		assertEquals("Mrce", result);
	}
	
	@Test
	public void testEveryNth2() {
		EveryTime eTime = new EveryTime();
		String result =eTime.everyNth("abcdefg", 2);
		
		assertEquals("aceg", result);
	}
	
	@Test
	public void testEveryNth3() {
		EveryTime eTime = new EveryTime();
		String result =eTime.everyNth("abcdefg", 3);
		
		assertEquals("adg", result);
	}
	
	@Test
	public void testEveryNth4() {
		EveryTime eTime = new EveryTime();
		String result =eTime.everyNth("a b c d e f g h i j k l m n o p q r s t u v w x y z", 2);
		
		assertEquals("abcdefghijklmnopqrstuvwxyz", result);
	}
	
	@Test
	public void testEveryNth5() {
		EveryTime eTime = new EveryTime();
		String result =eTime.everyNth("a b c d e f g h i j k l m n o p q r s t u v w x y z", 3);
		
		assertEquals("a d g j m p s v y", result);
	}
	
	

}
