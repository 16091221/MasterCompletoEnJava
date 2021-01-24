package org.scesar.patrones.single.decorator.decorador;

import org.scesar.patrones.single.decorator.Formateable;

public class RemplazarEspciosDecorador extends TextoDecorador{
    public RemplazarEspciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
