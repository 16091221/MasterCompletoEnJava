package org.scesar.datetime.ejemplos;

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
        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes);
        System.out.println("Número del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "MX")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "MX")));
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());
        
        fechaActual = LocalDate.of(2021,2,25);
        System.out.println("fechaActual = " + fechaActual);
        
        
        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 11);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);
        
        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        //LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek sabado = LocalDate.parse("2021-01-23").getDayOfWeek();
        System.out.println("miercoles = " + sabado);
        
        int once = LocalDate.of(2020, 11, 11).getDayOfMonth();
        System.out.println("once = " + once);
        
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2020,11, 11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);
        
        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
}
