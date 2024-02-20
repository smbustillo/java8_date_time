package org.smbustillo.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());

        Month mesActual = fechaActual.getMonth();
        System.out.println("Mes: " + mesActual);
        System.out.println("Núm. mes: " + mesActual.getValue());
        System.out.println("Mes en español: " + mesActual.getDisplayName(
                TextStyle.FULL,new Locale("es","ES")));

        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Día del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2024, 2, 19);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020, Month.NOVEMBER,11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-11-02");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate manana = LocalDate.now().plusDays(1);
        System.out.println("manana = " + manana);

        LocalDate mesPasado = LocalDate.now().minusMonths(1);
        System.out.println("mesPasado = " + mesPasado);

        DayOfWeek martes = LocalDate.parse("2024-02-20").getDayOfWeek();
        System.out.println("martes = " + martes);
        System.out.println("en español: " + martes.getDisplayName(
                TextStyle.FULL, Locale.forLanguageTag("es")));

        int veinte = LocalDate.of(2024,02,20).getDayOfMonth();
        System.out.println("veinte = " + veinte);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2020-02-20"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-02-14").isAfter(LocalDate.parse("2020-02-02"));
        System.out.println("esDespues = " + esDespues);
    }
}