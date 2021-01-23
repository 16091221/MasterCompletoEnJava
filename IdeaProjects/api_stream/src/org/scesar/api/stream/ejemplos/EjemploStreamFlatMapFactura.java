package org.scesar.api.stream.ejemplos;

import org.scesar.api.stream.ejemplos.models.Factura;
import org.scesar.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("Compras tecnología"));
        u1.addFactura(new Factura("Compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);

        //Sin usar api Stream

        /*for (Usuario u: usuarios){
            for (Factura f: u.getFacturas()){
                System.out.println(f.getDrescripcion());
            }
        }*/

        //Utilizando flatMap

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDrescripcion().concat(": cliente ")
                        .concat(f.getUsuario().toString())));
    }
}
