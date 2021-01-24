package org.scesar.java.jdbc;

import org.scesar.java.jdbc.modelo.Producto;
import org.scesar.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.scesar.java.jdbc.repositorio.Repositorio;
import org.scesar.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("====================== listar ======================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("====================== obtener por id ======================");
            System.out.println(repositorio.porId(2L));

            System.out.println("====================== eliminar producto ======================");
            Producto producto = new Producto();
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado");
            repositorio.listar().forEach(System.out::println);
    }
}
