package uk.ac.belfastmet.examples.classes;

import java.util.ArrayList;

public class MethodExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExamples myExample = new MethodExamples();
		System.out.println(myExample.returnInt());
		System.out.println(myExample.returnString());
		System.out.println(myExample.returnMultiple(2, 5));
		System.out.println(myExample.returnArraylist());
		myExample.lookingAtArrayList();
	}
	
	/**
	 * method to return 42
	 * @return int
	 */
	public int returnInt() {
		int index = 42;
		return index;
	}
	
	
	/**
	 * method to return hello world
	 * @return string
	 */
	public String returnString() {
		String index = "hello world";
		return index;
	}
	
	/**
	 * method to multiply two values and return the result
	 * @param val1
	 * @param val2
	 * @return val1 * val2 as int
	 */
	public int returnMultiple(int val1, int val2) {
		int index = val1 * val2;
		return index;
	}
	
	/**
	 *method to populates an arraylist
	 * @return the new array list
	 */
	public ArrayList<String> returnArraylist() {
		ArrayList<String> index = new ArrayList<String>();
		index.add("hello");
		index.add("world");
		
		return index;
	}
	
	/**
	 * method to print out an arraylist to console to see
	 */
	public void lookingAtArrayList() {
		ArrayList<String> index = new ArrayList<String>();
		index.add("M<");
		System.out.println(index);
	}
	
	

}
