package org.scesa.optional.ejemplo;

import org.scesa.optional.ejemplo.models.Computador;
import org.scesa.optional.ejemplo.models.Fabricante;
import org.scesa.optional.ejemplo.models.Procesador;
import org.scesa.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.scesa.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);
    }

}
