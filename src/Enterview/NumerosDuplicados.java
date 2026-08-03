package Enterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumerosDuplicados {

	/*
	 * public static ArrayList<Integer> debugDuplicatedNumbers(List<Integer>
	 * listOfNumbers) {
	 * 
	 * //Array to store ONLY unique numbers NOT duplicated ones. ArrayList<Integer>
	 * cleanList = new ArrayList<Integer>(); int cont = 0; for(int i=0;
	 * i<listOfNumbers.size(); i++) { for(int j=0; j<listOfNumbers.size(); j++) {
	 * 
	 * if((!listOfNumbers.get(i).equals(0) && !listOfNumbers.get(j).equals(0)) &&
	 * (listOfNumbers.get(i).equals(listOfNumbers.get(j)))){ cont++;
	 * 
	 * if(cont >= 2) { listOfNumbers.set(j,0); } else {
	 * cleanList.add(listOfNumbers.get(i)); } }
	 * 
	 * } cont = 0; }
	 * 
	 * return cleanList; }
	 */

	// Metodo para remover duplicados de una lista de numeros
	public static ArrayList<Integer> debugDuplicatedNumbers1(List<Integer> l) {

		ArrayList<Integer> nonDuplicatNumbersList = new ArrayList<>();
		int cont = 0;

		for (int i = 0; i < l.size(); i++) {
			for (int j = 0; j < l.size(); j++) {

				if (!l.get(i).equals(0) && !l.get(j).equals(0) && l.get(i).equals(l.get(j))) {
					cont++;
					if (cont <= 1) {
						nonDuplicatNumbersList.add(l.get(i));
					} else {

						l.set(j, 0);
					}
				} 

			}
			
			cont = 0;
		}

		return nonDuplicatNumbersList;
	}

	// Method to work with Arrays
	public static int[] depugDuplicatedNumbers2(int[] integerArray) {
		// array for store ONLY unique numbers NOT duplicated ones
		int[] uniqueNumbers = new int[15];
		int cont = 0;

		for (int i = 0; i < integerArray.length; i++) {
			for (int j = 0; j < integerArray.length; j++) {

				if ((integerArray[i] != 0 && integerArray[j] != 0) && (integerArray[i] == integerArray[j])) {
					cont++;
					if (cont >= 2) {
						integerArray[j] = 0;
					} else {
						uniqueNumbers[i] = integerArray[i];
					}
				}

			}
			cont = 0;
		}
		return uniqueNumbers;
	}

	public static void main(String[] args) {

		// List is generated with random values for testing porpouses
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(4);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(8);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(9);
		listaNumeros.add(9);
		listaNumeros.add(12);
		listaNumeros.add(12);
		listaNumeros.add(1);
		listaNumeros.add(6);
		listaNumeros.add(5);
		listaNumeros.add(45); 
		listaNumeros.add(14);

		List<Integer> nonDuplicates = NumerosDuplicados.debugDuplicatedNumbers1(listaNumeros);

		//System.out.println(nonDuplicates);

		Collections.sort(nonDuplicates);

		nonDuplicates.stream().forEach(x -> System.out.print(x + " "));
		

			//System.out.print(NumerosDuplicados.fibonacciSecuencial(20));
		
		

	}

	// Algoritmo de fibonacci secuencial

	public static int fibonacciSecuencial(int terminos) {

		int a = 0, b = 1, c = 0, cont = 0;
		System.out.print("0, 1 , ");
		for (int i = 0; i < terminos; i++) {

			cont = a + b;
			a = b;
			b = cont;
		
			System.out.print(cont+" , ");
			
		}
		return cont;
	}
	
	public static int fibonnacciRecursivo(int terminos) {
		
					
		   if(terminos == 0) {
			   return 0;
		   }
		   
		   if(terminos == 1) {
			   return 1;
		   }	   
			
		
		
		return fibonnacciRecursivo(terminos - 1) + fibonnacciRecursivo(terminos - 2);
	}
}
