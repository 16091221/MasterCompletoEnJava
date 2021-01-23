package org.scesa.optional.ejemplo;

import org.scesa.optional.ejemplo.models.Computador;
import org.scesa.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.scesa.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));

        /*Optional<Computador> pc = repositorio.filtrar("asus rog");

        if(pc.isPresent()) {
            System.out.println(pc.get());
        }
        else {
            System.out.println("No se encontro");
        }*/
    }
}
