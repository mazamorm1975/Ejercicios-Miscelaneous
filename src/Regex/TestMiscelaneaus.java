package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMiscelaneaus {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		if (entrada == null) {
			System.err.println("No se ha ingresado nada");
		}

		while (true) {
			
			Pattern pattern = Pattern.compile(entrada.nextLine());
			Matcher matcher = pattern.matcher(entrada.nextLine());
			boolean found = false;
			
			while (matcher.find()) {
				System.out.printf(
						"I found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());

				found = true;
			}
			
			if (!found) {
				System.out.printf("No match found.%n");
			}
		}

	}
}
