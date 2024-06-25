package com.Optional;

import java.util.Optional;

import com.modelos.Cliente;

public class Program {

	public void practicaOptional() {
		
		//Optional<Cliente> op = Optional.of(new Cliente(1,"Mario","Zamora", "mzamora114@hotmail.com"));
		Optional<Cliente> op = Optional.ofNullable(null);
		
		System.out.println(op.orElseGet(()-> new Cliente()));
		
	}
	
	public static void main(String[] args) {
		Program app = new Program();
		app.practicaOptional();
	}

}
