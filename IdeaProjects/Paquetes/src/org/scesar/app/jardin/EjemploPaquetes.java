package org.scesar.app.jardin;

import org.scesar.app.hogar.*; // * = wildcard accede a todos los metodos del paquete

import static org.scesar.app.hogar.Persona.*;
import static org.scesar.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setApellido("Soriano");
        p.setNombre("César");
        p.setColorPelo(CAFE);
        System.out.println(p.getApellido() + " " + p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
