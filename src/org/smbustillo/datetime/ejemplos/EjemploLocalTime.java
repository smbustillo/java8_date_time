package org.smbustillo.datetime.ejemplos;

import java.time.LocalTime;
import java.util.Locale;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Min: " + ahora.getMinute());
        System.out.println("Seg: " + ahora.getSecond());

        LocalTime seisTreinta = LocalTime.of(6,30);
        System.out.println("seisTreinta = " + seisTreinta);

        LocalTime sieteTreinta = LocalTime.parse("07:30");
        System.out.println("sieteTreinta = " + sieteTreinta);

        boolean esAntes = seisTreinta.isBefore(sieteTreinta);
        System.out.println("esAntes = " + esAntes);

    }
}
