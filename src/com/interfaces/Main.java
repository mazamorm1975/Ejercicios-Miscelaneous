package com.interfaces;

public class Main {

	public static void main(String[] args) {
	
		Operacion ope1 = (a,b) -> a + b;
		
		int resultado = ope1.OperacionSuma(5, 5);
		
		System.out.println(resultado);
	}

}
