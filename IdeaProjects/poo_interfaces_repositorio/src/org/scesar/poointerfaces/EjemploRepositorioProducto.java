package org.scesar.poointerfaces;

import org.scesar.poointerfaces.modelo.Cliente;
import org.scesar.poointerfaces.modelo.Producto;
import org.scesar.poointerfaces.repositorio.Direccion;
import org.scesar.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.scesar.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.scesar.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== paginable =====");

        List<Producto> paginable = repo.listar(0,2);
        paginable.forEach(System.out::println);

        System.out.println("==== ordenar ====");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        for (Producto c: productosOrdenAsc){
            System.out.println(c);
        }

        System.out.println("==== editar ====");
        Producto lamparaActualizar = new Producto("lampara de escritorio", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(2);
        System.out.println(lampara);
        System.out.println("=============================");
        repo.listar("precio", Direccion.ASC).forEach(System.out::println);

        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("======= total ========");
        System.out.println("Total de registros: " + repo.total());

    }
}
