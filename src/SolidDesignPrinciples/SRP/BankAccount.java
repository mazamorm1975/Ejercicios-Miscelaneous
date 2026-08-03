package SolidDesignPrinciples.SRP;

public class BankAccount {
	
	private int balance;
	
	public void deposit(int amount) {
	
		balance += amount;		
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	/*
	 * Si se requiere tener mas de una responsabilidad, se podria crear la clase PrintStatement.java para gestionar aparte 
	 * todo lo relacionado a la impresión de estados de cuenta, pasando solo el monto de la cantidad retirada, y
	 * y quitar el metodo printStatement de esta clase. Aqui se aplica el principio de Single Responsability Pattern
	 */
	public void printStatement() {
		System.out.println("El monto retirado fue de "+ balance);
	}

}
