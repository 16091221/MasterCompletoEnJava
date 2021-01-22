package org.scesar.poointerfaces.repositorio;

import org.scesar.poointerfaces.repositorio.excepciones.AccesoDatosException;
import org.scesar.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();

    T porId(Integer id) throws AccesoDatosException;
    void crear(T t) throws AccesoDatosException;
    void editar(T t) throws AccesoDatosException;
    void eliminar(Integer id) throws AccesoDatosException;
}
