package org.scesar.poointerfaces.repositorio;

import org.scesar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
