package org.scesar.patrones.single.decorator.decorador;

import org.scesar.patrones.single.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;


    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}
