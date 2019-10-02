package uk.ac.belfastmet.classes;

import java.util.ArrayList;

public class MyTest {
	
	public static String concatinate (String... values) {
		String result = "";
		
		for(String s : values)
		{
			result += s;
		}
		return result;
	}
	
	public static int mySum (int... values) {
		int result = 0;
		
		for(int s : values)
		{
			result += s;
		}
		return result;
	}
}
