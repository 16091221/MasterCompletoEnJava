package org.scesar.api.stream.ejemplos;

import org.scesar.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamSingle2 {
    public static void main(String[] args) {

        Usuario usuario = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(3))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(usuario);
        //nombres.forEach(System.out::println);

    }
}
