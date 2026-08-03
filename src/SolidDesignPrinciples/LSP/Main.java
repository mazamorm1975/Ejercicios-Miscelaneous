package SolidDesignPrinciples.LSP;

public class Main {

	public static void main(String[] args) {

		Bird bird = new Bird();
		animalCanMove(bird);
		
			
	}

	public static void animalCanMove(Animal animal) {
		animal.move();
	}
	
}
