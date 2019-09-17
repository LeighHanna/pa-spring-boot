package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dwarf> dwarfMen = new ArrayList<Dwarf>();
		dwarfMen.add(new Dwarf("Sleepy","Disney"));
		dwarfMen.add(new Dwarf("Happy","Disney"));
		dwarfMen.add(new Dwarf("Grumpy","Disney"));
		dwarfMen.add(new Dwarf("Dopey","Disney"));
		dwarfMen.add(new Dwarf("Bashful","Disney"));
		dwarfMen.add(new Dwarf("Doc","Disney"));
		dwarfMen.add(new Dwarf("Sneezy","Disney"));
		
		dwarfMen.add(new Dwarf("Thorin","Tolkin"));
		dwarfMen.add(new Dwarf("Balin","Tolkin"));
		
		
	for(Dwarf dwarf:dwarfMen)
	{
		System.out.println(dwarf.getName() + " from " + dwarf.getAuthor());

	}
	}

}
