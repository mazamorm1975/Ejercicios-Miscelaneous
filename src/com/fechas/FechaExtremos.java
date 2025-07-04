package com.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FechaExtremos {

    public static void main(String[] args) {
        // Lista de fechas como strings
        List<String> fechas = Arrays.asList(
            "2024-03-15",
            "2023-11-02",
            "2025-01-10",
            "2024-07-20"
        );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Optional<LocalDate> fechaMin = fechas.stream()
                .map(f -> LocalDate.parse(f, formatter))
                .min(LocalDate::compareTo);

        Optional<LocalDate> fechaMax = fechas.stream()
                .map(f -> LocalDate.parse(f, formatter))
                .max(LocalDate::compareTo);
        
        LocalDate defaultDate = LocalDate.now(); // o cualquier valor que consideres seguro
        LocalDate fechaMasAntigua = fechaMin.orElse(defaultDate);
        LocalDate fechaMasReciente = fechaMax.orElse(defaultDate);
     
        System.out.println("Fecha mas antigua : "+ fechaMasAntigua);
        System.out.println("Fecha mas reciente : "+ fechaMasReciente);
        
    }
}