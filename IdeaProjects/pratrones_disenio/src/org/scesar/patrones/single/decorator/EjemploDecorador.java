package org.scesar.patrones.single.decorator;

import org.scesar.patrones.single.decorator.decorador.MayusculaDecorador;
import org.scesar.patrones.single.decorator.decorador.RemplazarEspciosDecorador;
import org.scesar.patrones.single.decorator.decorador.ReversaDecorador;
import org.scesar.patrones.single.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Andrés");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspciosDecorador remplazar = new RemplazarEspciosDecorador(subrayar);
        System.out.println(subrayar.darFormato());
    }
}
