package com.fechas;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fechas {
	
	public Long validarFechas() {
		
		LocalDate fechaInicial = LocalDate.of(2024, 06, 05);
		LocalDate fechaFinal = LocalDate.of(2024, 06, 10);
		
		String fechaI = fechaInicial.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String fechaF = fechaFinal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(fechaI);
		System.out.println(fechaF);
		
		Long dayDifference = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
		
			
		
		return dayDifference;
	}

	public static void main(String[] args) {

			Fechas f = new Fechas();
			System.out.println(f.validarFechas());

	}
}
