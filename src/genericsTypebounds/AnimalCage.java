package genericsTypebounds;

import java.util.ArrayList;
import java.util.List;

public class AnimalCage<T extends Animal> {
	
	
		private List <T> animals;

		
	    public AnimalCage() {
			this.animals = new ArrayList <T>();
		}

	    
	    public void addAnimal(T animal) {
	    	this.animals.add(animal);
	    }
	       
		public void makeSounds() {
	        for (T animal : animals) {
	            animal.makeSound();
	        }
	    }
	}



