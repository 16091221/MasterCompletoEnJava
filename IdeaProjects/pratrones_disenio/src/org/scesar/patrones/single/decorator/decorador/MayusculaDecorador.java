package org.scesar.patrones.single.decorator.decorador;

import org.scesar.patrones.single.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
