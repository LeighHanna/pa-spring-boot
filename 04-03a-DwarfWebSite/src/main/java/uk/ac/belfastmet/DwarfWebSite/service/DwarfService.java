package uk.ac.belfastmet.DwarfWebSite.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.DwarfWebSite.domain.Dwarf;


@Service
public class DwarfService {
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
	public ArrayList<Dwarf> getDisneyDwarfs()
	{
		 this.disneyDwarfs = new ArrayList<Dwarf>();
		 this.disneyDwarfs.add(new Dwarf("Sleepy", "Disney", "Sleepy.png"));
		 this.disneyDwarfs.add(new Dwarf("Happy", "Disney", "Happy.png"));
		 this.disneyDwarfs.add(new Dwarf("Bashful", "Disney", "Bashful.png"));
		 this.disneyDwarfs.add(new Dwarf("Dopey", "Disney", "Dopey.png"));
		 this.disneyDwarfs.add(new Dwarf("Doc", "Disney", "Doc.png"));
		 this.disneyDwarfs.add(new Dwarf("Grumpy", "Disney", "Grumpy.png"));
		 this.disneyDwarfs.add(new Dwarf("Sneezy", "Disney", "Sneezy.png"));
		 
		 
		 return this.disneyDwarfs;
	}
	
	public ArrayList<Dwarf> getTolkienDwarfs()
	{
		 this.tolkienDwarfs = new ArrayList<Dwarf>();
		 this.tolkienDwarfs.add(new Dwarf("Thorin", "tolkien", "Thorin.png"));
		 this.tolkienDwarfs.add(new Dwarf("Balin", "tolkien", "Balin.png"));
		 this.tolkienDwarfs.add(new Dwarf("Dwalin", "tolkien", "Dwalin.png"));
		 this.tolkienDwarfs.add(new Dwarf("Fili", "tolkien", "Fili.png"));
		 this.tolkienDwarfs.add(new Dwarf("Kili", "tolkien", "Kili.png"));
		 this.tolkienDwarfs.add(new Dwarf("Dori", "tolkien", "Dori.png"));
		 this.tolkienDwarfs.add(new Dwarf("Nori", "tolkien", "Nori.png"));
		 this.tolkienDwarfs.add(new Dwarf("Oin", "tolkien", "Oin.png"));
		 this.tolkienDwarfs.add(new Dwarf("Ori", "tolkien", "Ori.png"));
		 this.tolkienDwarfs.add(new Dwarf("Gloin", "tolkien", "Gloin.png"));
		 this.tolkienDwarfs.add(new Dwarf("Bifur", "tolkien", "Bifur.png"));
		 this.tolkienDwarfs.add(new Dwarf("Bofur", "tolkien", "Bofur.png"));
		 this.tolkienDwarfs.add(new Dwarf("Bombur", "tolkien", "Bombur.png"));
		 
		 return this.tolkienDwarfs;
	}
}
