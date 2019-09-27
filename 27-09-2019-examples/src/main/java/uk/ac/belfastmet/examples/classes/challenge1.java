package uk.ac.belfastmet.examples.classes;

import java.util.ArrayList;

public class challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		challenge1 chal1 = new challenge1();
		ArrayList<String> index1;
		index1 = chal1.createArray();
		System.out.println("Array state = " + index1);	
		System.out.println("-----------------------------");
		chal1.addToArray(index1);
		System.out.println("Array state = " + index1);
		System.out.println("-----------------------------");
		chal1.removeArrayElephant(index1);
		System.out.println("Array state = " + index1);
		System.out.println("-----------------------------");
		chal1.removeArrayAll(index1);
		System.out.println("Array state = " + index1);
		System.out.println("-----------------------------");
		
	}
;
	public ArrayList<String> createArray(){
		ArrayList<String> index = new ArrayList<String>();
		index.add("Elephant");
		index.add("Rhino");
		index.add("Lion");
		System.out.println("-Elephant, Rhino and Lion have ben added to the array-");	
		return index;
	}
	
	public ArrayList<String> addToArray(ArrayList<String> index){
		index.add("Dog");
		index.add("Cat");
		System.out.println("-Dog and Cat have ben added to the array-");	
		return index;
	}
	
	public ArrayList<String> removeArrayElephant(ArrayList<String> index){
		index.remove("Elephant");
		System.out.println("-Elephant has been remove from the array-");	
		return index;
	}
	
	public ArrayList<String> removeArrayAll(ArrayList<String> index){
		index.clear();
		System.out.println("-Array has been emptyed-");	
		return index;
	}
}
