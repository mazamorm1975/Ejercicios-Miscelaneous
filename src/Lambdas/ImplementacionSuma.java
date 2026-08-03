package Lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.modelos.Cliente;

public class ImplementacionSuma {

	public static void method1() {

		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> esPar = x -> x % 2 == 0;

		List<Integer> numerosPares = numerosFiltrados(listaNumeros, esPar);

		System.out.print(numerosPares);

	}

	private static List<Integer> numerosFiltrados(List<Integer> list, Predicate<Integer> fx) {

		List<Integer> numerosPares = new ArrayList<>();

		for (int num : list) {
			if (fx.test(num)) {
				numerosPares.add(num);
			}
		}

		return numerosPares;
	}

	// Metodo crearPassword

	public static String createPassword() {
		String cadenaCaracteres = "!#$%&/()=?¡¿@ABCDEEFGHIJKMNOPQRSTWXYZabcdefghijkmnopqrstwxyz";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			int indiceAleatorio = new Random().nextInt(cadenaCaracteres.length());
			sb.append(cadenaCaracteres.charAt(indiceAleatorio));

		}

		return sb.toString();

	}

	
	public static void main(String[] args) {

		String password = "";

		password = ImplementacionSuma.createPassword();

		System.out.println(password);

		ImplementacionSuma.method1();

		System.out.println();

		Operacion oper = (x, y) -> x / y;

		int resultado = oper.operacionAritmetica(10, 5);

		System.out.println("El resultado de la división es: " + resultado);

		// Convertir una array de caracteres en una string
		char[] variableChar = new char[5];
		variableChar[0] = 'M';
		variableChar[1] = 'A';
		variableChar[2] = 'R';
		variableChar[3] = 'I';
		variableChar[4] = 'O';

		String variableString = "";
		// guardar en variable tipo String
		for (int i = 0; i < 5; i++) {
			variableString += Character.toString(variableChar[i]);

		}
		System.out.println(variableString);
		
	}

}
