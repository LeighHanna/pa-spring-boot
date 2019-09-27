package uk.ac.belfastmet.examples.classes;

import java.util.ArrayList;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExamples myExample = new ArrayExamples();
		myExample.addSringToArryaList();
		System.out.println("-----------------------------");
		myExample.containsString();
		System.out.println("-----------------------------");
	}
	
	public void addSringToArryaList() {
		ArrayList<String> listOfStuff = new ArrayList<String>();
		listOfStuff.add("Good");
		listOfStuff.add("Morning");
		System.out.println("Size of Array: " + listOfStuff.size());
		
		for(String string : listOfStuff) {
			System.out.println(string);
		}
	}
	
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
