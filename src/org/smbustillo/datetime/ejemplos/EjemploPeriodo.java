package org.smbustillo.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(1975,7,14);
        LocalDate fecha2 = LocalDate.now();

        fecha1 = fecha1.withMonth(6); //setea el mes generando una nueva instancia del objeto

        Period periodo = Period.between(fecha1,fecha2);
        System.out.println("periodo = " + periodo);

        System.out.printf("Periodo entre %s y %s, hay %d años, %d meses y %d días.",
                fecha1, fecha2, periodo.getYears(), periodo.getMonths(),periodo.getDays());
    }
}
