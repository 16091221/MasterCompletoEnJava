package org.scesar.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {

    public static void main(String[] args) {

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2); //Cada dos segundos se emite un valor
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return contador.incrementAndGet();
        })
                .limit(5) //se emite un valor hasta llegar a 5
                .forEach(System.out::println);
    }
}
