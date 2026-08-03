package Enterview;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.modelos.Cliente;
import com.modelos.OperationsGenerics;

public class Enterview {

	
	public static String invertirCadena(String str) {

		if (str == null) {
			return "No se ha ingresado ninguna cadena a invertir.";
		}

		StringBuilder cadena = new StringBuilder(str);

		int longitudCadena = cadena.length();

		for (int i = 0; i < longitudCadena / 2; i++) {

			char caracterTemporal = cadena.charAt(i);
			int indiceFinalCadena = longitudCadena - 1 - i;

			cadena.setCharAt(i, cadena.charAt(indiceFinalCadena));
			cadena.setCharAt(indiceFinalCadena, caracterTemporal);

		}

		return cadena.toString();
	}

	public static void main(String[] args) throws Exception {

		String texto = "Mario Zamora Martinez";
		System.out.println("Original: " + texto);

		String invertido = invertirCadena(texto);
		System.out.println("Invertido: " + invertido);

		// Enterview enterview = new Enterview();

		/*
		 * String texto2 =
		 * "Mario Zamora Mario zamora mARIo, zamora MARIO ZAMORA ZAMORA ZAMORA"; String
		 * limpiado = texto2.toLowerCase().replaceAll("[^a-z\\s]", "");
		 * 
		 * String[] valores = { "mario", "zamora" };
		 * 
		 * for (String val : valores) {
		 * 
		 * int vecesRepetida = Enterview.contabilizador(limpiado, val); //int
		 * vecesRepetida = Enterview.test(limpiado, val);
		 * System.out.println("la palabra " + val + " fue encontrada " + vecesRepetida +
		 * " veces"); }
		 */

		/*
		 * int[] enteros = { 5, 1, 8, 7, 2, 4 };
		 * 
		 * int a, b, aux;
		 * 
		 * for (int i = 1; i < enteros.length - 1; i++) { for (int j = 0; j <
		 * enteros.length - i; j++) if (enteros[j] > enteros[j + 1]) { aux = enteros[j];
		 * enteros[j] = enteros[j + 1]; enteros[j + 1] = aux; } }
		 * 
		 * for (int i = 0; i < enteros.length; i++) { System.out.print(enteros[i] +
		 * ", "); }
		 */

	}

	public static int vecesPalabraEncontrada(String texto, String palabra) {

		String textoSanitizado = texto.toLowerCase().replaceAll("[^a-z\\s]", "");

		int indice = 0;
		int cont = 0;

		while ((indice = textoSanitizado.indexOf(palabra, indice)) != -1) {
			cont++;
			indice = indice + palabra.length();

		}
		return cont;
	}

	public static int test(String texto, String palabraABuscar) {
		// String texto = "Mario MaRiO Zamora ZAMORA zAMOra zamora zamora ZAMORA MARIO";
		String textoSanitizado = texto.toLowerCase().replaceAll("[^a-z\\s]", "");

		Pattern p = Pattern.compile(palabraABuscar);
		int contador = 0;
		Matcher m = p.matcher(texto);

		while (m.find()) {
			contador++;
		}

		return contador;
	}

	public static int contabilizador(String texto, String palabra) {

		int indice = 0;
		int cont = 0;

		while ((indice = texto.indexOf(palabra, indice)) != -1) {
			cont++;
			indice = indice + palabra.length();
		}

		return cont;
	}

}
