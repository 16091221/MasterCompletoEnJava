package org.scesar.poointerfaces.repositorio;

import org.scesar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Direccion dir);

}
