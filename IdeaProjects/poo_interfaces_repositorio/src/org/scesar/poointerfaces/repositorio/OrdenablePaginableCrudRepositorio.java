package org.scesar.poointerfaces.repositorio;
//Herencia multiple de interfaces
public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio{

}
