package org.scesar.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamFilterRange {
    public static void main(String[] args) {

        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);

        //int resultado = numeros.reduce(0, Integer::sum);
        //int resultado = numeros.sum();
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());

    }
}
