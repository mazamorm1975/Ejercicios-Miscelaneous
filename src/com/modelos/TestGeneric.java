package com.modelos;

import java.util.List;

public class TestGeneric<T> implements OperationsGenerics<T> {
	
	
	public T imprimir(T t){
		return t;
	}

	
	@Override
	public List<T> desplegarListado(List<T> t) {
	    return t.stream().toList();
	}
	
		
	
}	
 
