package org.scesar.java.jdbc;

import org.scesar.java.jdbc.modelo.Categoria;
import org.scesar.java.jdbc.modelo.Producto;
import org.scesar.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.scesar.java.jdbc.repositorio.Repositorio;
import org.scesar.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("====================== listar ======================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("====================== obtener por id ======================");
            System.out.println(repositorio.porId(2L));

            System.out.println("====================== editar nuevo producto ======================");
            Producto producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Corsair k95 mecánico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito!");
            repositorio.listar().forEach(System.out::println);

    }
}
