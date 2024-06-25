package com.duplicados;

public class EncontrarNumerosDuplicados {

	public static void main(String[] args) {
		
		//Se declara variable de contabilización
		int cont= 0;
		
		//Se genera arreglo primario con valores
		int matriz1[] = new int[11];
		matriz1[0]= 1;
		matriz1[1]= 1;
		matriz1[2]= 5;
		matriz1[3]= 1;
		matriz1[4]= 2;
		matriz1[5]= 2;
		matriz1[6]= 9;
		matriz1[7]= 4;
		matriz1[8]= 4;
		matriz1[9]= 5;
		matriz1[10]= 6;
        
		
		//Se genera arreglo destino que almacenara los mismos valores que la matrzi1
		int matriz2[] = new int[11];
		
		//Se copia el arreglo matriz1 a matriz2
		for(int i=0; i<matriz1.length; i++) {
			matriz2[i] = matriz1[i];
		}
		
		
		//Se inicia bucle repetitivo para validaciones
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1.length; j++) {
				
				//Se valida si el valor de la primer posicion de la matriz 1 coincide con el 
				//valor de la primer posición del arreglo matriz2
				if(matriz1[i] == matriz2[j]) {
					cont++;
					matriz2[j]= 0;	
			
				}
				
			}
			if(cont !=0) {
			System.out.println("El numero "+matriz1[i]+" esta repetido "+ cont+" veces");
			}
			cont=0;
		}
		
		
		
		
	}
	
}
