package org.scesar.poointerfaces.repositorio;

import org.scesar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
