package org.smbustillo.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.of(2020, Month.APRIL,24, 20,45,59);
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo  = LocalDateTime.parse("2024-02-02T21:45:59.890");
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        LocalDateTime fechaTiempo2  = fechaTiempo.plusDays(1).plusHours(4);
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        
        Month mes = fechaTiempo2.getMonth();
        System.out.println("mes = " + mes);
        
        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);
        
        int anil = fechaTiempo.getYear();
        System.out.println("anil = " + anil);
        
        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 = " + formato2);

        String formato3 = df.format(fechaTiempo2);
        System.out.println("formato3 = " + formato3);
    }
    
}
