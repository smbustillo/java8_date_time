package org.smbustillo.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.parse("2024/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        //ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));
        ZonedDateTime zonaNy = fechaLocal.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Hora partida en New York = " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Hora llegada a Madrid = " + zonaMadrid);

        DateTimeFormatter f= DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje: ");
        System.out.println("Partida NY:  " + f.format(zonaNy));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);


    }
}
