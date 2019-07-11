package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
	
		
		//Polymorphic array. 
		Mammal[] animals = new Mammal[3]; 
		
		//Note that animals' reference type is Mammal(super class) but the objects
		//on the right are of class Human, Whale and Horse, the subclasses
		// of Mammal. This is a case of polymorphism.
		animals[0] = new Human();
		animals[1] = new Whale();
		animals[2] = new Horse();
		
		for(int i = 0; i<3; i++)
			
			animals[i].move();
		
		//Note that the method move is overidden in the 3 subclasses
	}

}
