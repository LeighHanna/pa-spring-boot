package uk.ac.belfastmet;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
     Dwarf sleepy = new Dwarf();
     sleepy.setName("Sleepy");
     sleepy.setAuthor("Disney");
     dwarfs.add(sleepy);
     
     Dwarf happy = new Dwarf();
     happy.setName("Happy");
     happy.setAuthor("Disney");
     dwarfs.add(happy);
     
     Dwarf doc = new Dwarf();
     doc.setName("Doc");
     doc.setAuthor("Disney");
     dwarfs.add(doc);
     
     //------------------------------------------//etc
     
     Dwarf thorin = new Dwarf();
     thorin.setName("Thorin");
     thorin.setAuthor("Tolkin");
     dwarfs.add(thorin);
     
     Dwarf balin = new Dwarf();
     balin.setName("Balin");
     balin.setAuthor("Tolkin");
     dwarfs.add(balin);
     
     Dwarf dwalin = new Dwarf();
     dwalin.setName("Dwalin");
     dwalin.setAuthor("Tolkin");
     dwarfs.add(dwalin);
     
     System.out.println("The Dwarfs from Disney are:");
     for(Dwarf dwarf:dwarfs)
     {
    	 if(dwarf.getAuthor().equals("Disney"))
    	 {
    	 System.out.println(dwarf.getName());
    	 }
     }
     System.out.println("---------------------------------");
     System.out.println("The Dwarfs from Tolkin are:");
     for(Dwarf dwarf:dwarfs)
     {
    	 if(dwarf.getAuthor().equals("Tolkin"))
    	 {
    	 System.out.println(dwarf.getName());
    	 }
     }
    	 
     
	}

}
