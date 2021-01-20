package org.scesar.app.jardin;

import org.scesar.app.hogar.Persona;

public class Perro {

    public String nombre;
    public String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
