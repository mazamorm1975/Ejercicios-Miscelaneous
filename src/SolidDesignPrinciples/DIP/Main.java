package SolidDesignPrinciples.DIP;

public class Main {

	public static void main(String[] args) {

		RegularEngine regularEngine = new RegularEngine();
		TurboEngine turboEngine = new TurboEngine();;
		
		Car car1 = new Car(regularEngine);
		car1.startEngine();
		
		Car car2 = new Car(turboEngine);
		car2.startEngine();
	}

}
