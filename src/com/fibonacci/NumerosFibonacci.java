package com.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosFibonacci {
	
	public static int fiboRecursivo(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return	fiboRecursivo(n-1) + fiboRecursivo(n- 2);
	}

	public static void main(String[] args) {
		
		int a=0,b=1, cont=0, c=0;
		List<Integer> fibo = new ArrayList<>();
		
		System.out.println("Este es otro test");
				
		Scanner longitudTerminos = new Scanner(System.in);
		System.out.println("Ingresa el total de terminos de la serie Fibonacci => ");
		c = longitudTerminos.nextInt();
		
		System.out.print("0, 1");
		
		//Se itera por medio de bucle for
		for(int i = 0; i<c; i++) {
			
			cont = a +b;
			a = b;
			b = cont;
			fibo.add(cont);
			System.out.print(", "+cont);			
		}
		
		System.out.println("\n");
		
		//Se itera por medio de lambdas
		System.out.print("0, 1, ");		
		fibo.stream().forEach(x -> System.out.print(x+", "));
	

		//Se genera serie fibonacci de manera recursiva	
		System.out.println("\n");
		System.out.print("0");
		for(int i=0; i<c+1; i++) {
			System.out.print(", "+fiboRecursivo(i));
		}
		
		longitudTerminos.close();
	}
	
}
