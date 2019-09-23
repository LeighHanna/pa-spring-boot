package uk.ac.belfastmet.top10list.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.top10list.domain.Animal;

@Service
public class AnimalService {
	private ArrayList<Animal> animals;
	
	
	public ArrayList<Animal> getAnimals()
	{
		 this.animals = new ArrayList<Animal>();
		 
		 this.animals.add(new Animal("Peregrine Falcon", "Bird", "242 mph", "PeregrineFalcon.jpg"));
		 this.animals.add(new Animal("Golden Eagle", "Bird", "200 mph", "GoldenEagle.jpg"));
		 this.animals.add(new Animal("Spine-tailed Swift", "Bird", "106 mph", "Spine-tailedSwift.jpg"));
		 this.animals.add(new Animal("Frigate Bird", "Bird", "95 mph", "FrigateBird.jpg"));
		 this.animals.add(new Animal("Spur Winged Goose", "Bird", "88.23 mph", "SpurWingedGoose.jpg"));
		 this.animals.add(new Animal("Cheeta", "Mammal", "75 mph", "Cheeta.jpg"));
		 this.animals.add(new Animal("Sail Fish", "Fish", "68.35 mph", "SailFish.jpg"));
		 this.animals.add(new Animal("Pronghorn Antelope", "Mammal", "55 mph", "PronghornAntelope.jpg"));
		 this.animals.add(new Animal("Marlin Fish", "Fish", "50 mph", "MarlinFish.jpg"));
		 this.animals.add(new Animal("Blue Wildebeest", "Mammal", "50 mph", "BlueWildebeest.jpg"));
		 
		 
		 
		 return this.animals;
	}
	
	public ArrayList<Animal> getAnimalsBirds()
	{
		 getAnimals();
		 ArrayList<Animal> animalsNew = new ArrayList<Animal>();
		 for(Animal animal : animals)
		 {
			 if(animal.getType() == "Bird")
			 {
				 animalsNew.add(animal);
			 }
		 }
		 
		 return animalsNew;
	}
	
	public ArrayList<Animal> getAnimalsMammals()
	{
		 getAnimals();
		 ArrayList<Animal> animalsNew = new ArrayList<Animal>();
		 for(Animal animal : animals)
		 {
			 if(animal.getType() == "Mammal")
			 {
				 animalsNew.add(animal);
			 }
		 }
		 
		 return animalsNew;
	}
	
	public ArrayList<Animal> getAnimalsFish()
	{
		 getAnimals();
		 ArrayList<Animal> animalsNew = new ArrayList<Animal>();
		 for(Animal animal : animals)
		 {
			 if(animal.getType() == "Fish")
			 {
				 animalsNew.add(animal);
			 }
		 }
		 
		 return animalsNew;
	}
}
