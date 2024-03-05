package org.smbustillo.datetime.ejemplos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 * Calcular edad ingresando la fecha de nacimiento de una persona con java 8 date time.
 */
public class Tarea35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
        String fechaEnt = scanner.next();

        String[] fechaSplit = fechaEnt.split("-");

        int anio = Integer.parseInt(fechaSplit[0]);
        int mes = Integer.parseInt(fechaSplit[1]);
        int dia = Integer.parseInt(fechaSplit[2]);

        LocalDate fechaNac = LocalDate.of(anio,mes,dia);
        LocalDate fechaAct = LocalDate.now();

        System.out.println("La edad calculada es " + ChronoUnit.YEARS.between(fechaNac, fechaAct));


    }
}
