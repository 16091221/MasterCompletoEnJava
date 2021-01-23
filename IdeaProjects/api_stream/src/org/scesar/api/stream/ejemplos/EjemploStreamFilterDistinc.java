package org.scesar.api.stream.ejemplos;

import org.scesar.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterDistinc {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez"
                , "Pepe Mena", "Pepe Garcia", "Paco Gonzalez", "Paco Gonzalez")
                .distinct();
                nombres.forEach(System.out::println);

    }
}
