package org.scesar.anotaciones.ejemplo;

import org.scesar.anotaciones.ejemplo.models.Producto;
import org.scesar.anotaciones.ejemplo.procesador.JsonSerializador;
import java.time.LocalDate;


public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
