package com.modelos;

import java.util.ArrayList;
import java.util.List;

import Enterview.Enterview;

public class Main {

	
	public static void main(String[] args) throws Exception {

		
		List<Integer> empleados = new ArrayList<>();
		empleados.add(1);
		empleados.add(2);
		empleados.add(3);
		empleados.add(4);

		Enterview e = new Cliente();	//Upcasting
		//e.imprimirMensaje(); --> el metodo imprimirMensaje(), NO existe en la clase padre Enterview 
		Cliente c = (Cliente) e; //Downcasting
		c.imprimirMensaje();
	}
}
