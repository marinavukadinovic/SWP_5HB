package genericsTypebounds;

public class AnimalCageTest {
	
	    public static void main(String[] args) {
	    	
	    	Dog d = new Dog();
			Cat c = new Cat();
			AnimalCage<Animal> ac = new AnimalCage<Animal>();
			
			ac.addAnimal(c);
			ac.addAnimal(d);
			
			System.out.println();
			ac.makeSounds();
			
	    }}		
