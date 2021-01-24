package org.scesar.java.jdbc;

import org.scesar.java.jdbc.modelo.Categoria;
import org.scesar.java.jdbc.modelo.Producto;
import org.scesar.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.scesar.java.jdbc.repositorio.Repositorio;
import org.scesar.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("====================== listar ======================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("====================== obtener por id ======================");
            System.out.println(repositorio.porId(1L));

            System.out.println("====================== insertar nuevo producto ======================");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer mécanico");
            producto.setPrecio(550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            //repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito!");
            repositorio.listar().forEach(System.out::println);

    }
}