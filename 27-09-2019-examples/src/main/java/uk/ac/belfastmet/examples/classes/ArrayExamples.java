package uk.ac.belfastmet.examples.classes;

import java.util.ArrayList;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExamples myExample = new ArrayExamples();
		myExample.addSringToArrayList();
		System.out.println("-----------------------------");
		myExample.containsString();
		System.out.println("-----------------------------");
	}
	
	/**
	 * method to add to an array list and display success
	 */
	public void addSringToArrayList() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		for(String string : listOfStuff) {
			System.out.println(string);
		}
	}
	
	/**
	 * method to display if a sting contains a certain word
	 */
	public void containsString() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");	
		listOfStuff.add("Good");
		
		System.out.println("Does is contain [Good]? - " + listOfStuff.contains("Good"));
		
		listOfStuff.remove("Good");
		System.out.println("Size of Array: " + listOfStuff.size());
		System.out.println(listOfStuff);
	}

}
