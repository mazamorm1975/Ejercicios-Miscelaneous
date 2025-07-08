package com.modelos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Integer> empleados = new ArrayList<>();
		empleados.add(1);
		empleados.add(2);
		empleados.add(3);
		empleados.add(4);
		
		TestGeneric<Integer> ejemploGenericos = new TestGeneric<>();
		
		ejemploGenericos.imprimir(2025);
		
		System.out.println(ejemploGenericos.desplegarListado(empleados));
		
	}
}
