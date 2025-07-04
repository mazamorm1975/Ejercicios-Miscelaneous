package com.fechas;

import java.util.Calendar;
import java.util.Date;

public class Fechas {


	/*-- Método para verificar si una fecha excede los ultimos tres trimestres--*/
	
    public static boolean excedeUltimosTresTrimestres(Date fechaEvaluada, Date fechaReferencia) {
        // Restar 9 meses a la fecha de referencia
        Date fechaMenosNueveMeses = menosMeses(fechaReferencia, 9);
        

        // Calcular el inicio del trimestre al que pertenece esa fecha
        Date fechaLimite = calcularInicioTrimestre(fechaMenosNueveMeses);

        // Si la fecha evaluada es menor que la fecha límite, excede el rango
        return fechaEvaluada.before(fechaLimite);
    }

    // Resta meses a una fecha
    public static Date menosMeses(Date fecha, int meses) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.MONTH, -meses);
        return cal.getTime();
    }

    // Devuelve el inicio del trimestre de una fecha
    public static Date calcularInicioTrimestre(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);

        int mes = cal.get(Calendar.MONTH); // Enero = 0

        int mesInicioTrimestre;
        if (mes <= Calendar.MARCH) {
            mesInicioTrimestre = Calendar.JANUARY;
        } else if (mes <= Calendar.JUNE) {
            mesInicioTrimestre = Calendar.APRIL;
        } else if (mes <= Calendar.SEPTEMBER) {
            mesInicioTrimestre = Calendar.JULY;
        } else {
            mesInicioTrimestre = Calendar.OCTOBER;
        }

        cal.set(Calendar.MONTH, mesInicioTrimestre);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTime();
    }

	// Crea una fecha para pruebas
	public static Date crearFecha(int anio, int mes, int dia) {
		Calendar cal = Calendar.getInstance();
		cal.set(anio, mes, dia, 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	/*-- Método para verificar si una fecha excede los siguientes tres trimestres--*/
	
	public static boolean excedeProximosTresTrimestres(Date fechaEvaluada, Date fechaReferencia) {
        // Sumar 9 meses a la fecha de referencia
        Date fechaMasNueveMeses = sumarMeses(fechaReferencia, 9);

        // Calcular el fin del trimestre  al que pertenece
        Date fechaLimite = calcularFinTrimestre(fechaMasNueveMeses);

        // Si la fecha evaluada es después de la fecha límite, excede el rango
        return fechaEvaluada.after(fechaLimite);
    }

    // Suma meses a una fecha
    public static Date sumarMeses(Date fecha, int meses) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.MONTH, meses);
        return cal.getTime();
    }

    // Devuelve el fin del trimestre de una fecha
    public static Date calcularFinTrimestre(Date fecha) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);

        int mes = cal.get(Calendar.MONTH); // Enero = 0
        int mesFinTrimestre;

        if (mes <= Calendar.MARCH) {
            mesFinTrimestre = Calendar.MARCH;
        } else if (mes <= Calendar.JUNE) {
            mesFinTrimestre = Calendar.JUNE;
        } else if (mes <= Calendar.SEPTEMBER) {
            mesFinTrimestre = Calendar.SEPTEMBER;
        } else {
            mesFinTrimestre = Calendar.DECEMBER;
        }

        cal.set(Calendar.MONTH, mesFinTrimestre);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);

        return cal.getTime();
    }

    // Crear una fecha para pruebas
    public static Date crearFecha2(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes, dia, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

	
	public static void main(String[] args) {
		
 	  // Ejemplo de uso
        Date fechaReferencia = crearFecha(2016, Calendar.NOVEMBER, 14);  // 02/02/2025
        Date fechaEvaluada = crearFecha(2016, Calendar.AUGUST, 15);      // 15/03/2024

        boolean excede = excedeProximosTresTrimestres(fechaEvaluada, fechaReferencia);

        System.out.println("Fecha evaluada: " + fechaEvaluada);
        System.out.println("¿Excede los últimos 3 trimestres? " + excede);
	}
}
