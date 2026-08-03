package Enterview;

public class NumerosPrimos {

	public static void numerosPrimos(int[] listado) {

		int cont = 0;

		for (int i = 0; i < 12; i++) {

			cont = comprobarDivisibilidad(listado[i]);

			if (cont < 3) {

				System.out.println("El numero " + listado[i] + " es numero primo");

			} else  {
				System.out.println("El numero " + listado[i] +  " NO es numero primo");

			}
		}
	}

	public static int comprobarDivisibilidad(int numero) {

		int cont = 0;

		for (int i = 1; i < 100; i++) {

			if (numero % i == 0 && numero / numero == 1 ) {
				cont++;
			}
		}

		return cont;
	}

	public static void main(String[] args) {

		int[] numerosPrimos = { 7, 8, 9, 2, 1, 8, 7, 9,97,98,99,100 };

		numerosPrimos(numerosPrimos);

	}
}
