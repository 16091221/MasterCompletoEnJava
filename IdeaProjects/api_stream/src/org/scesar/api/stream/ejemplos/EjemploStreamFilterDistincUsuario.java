package org.scesar.api.stream.ejemplos;

import org.scesar.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterDistincUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzalez",
                "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);

    }
}
