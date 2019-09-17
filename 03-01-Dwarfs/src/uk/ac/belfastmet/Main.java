package uk.ac.belfastmet;

import java.util.ArrayList;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Leigh");
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Grumpy");
		dwarfs.add("Doc");
		
		System.out.println("The seven dwarfs are: ");
		
		for(String dwarf:dwarfs)
		{
			System.out.println(dwarf);
		}
		
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Oin");
		dwarves.add("Ori");
		dwarves.add("Gloin");
		dwarves.add("Bilfur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		dwarves.add("Bilbo");
		dwarves.add("Gandelf");
			
		System.out.println("");
		System.out.println("The party of Thorin is: ");
		
		for(String dwarve:dwarves)
		{
			System.out.println(dwarve);
		}
	}

}
