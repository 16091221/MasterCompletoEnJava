package org.scesa.optional.ejemplo.repositorio;

import org.scesa.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);
}
