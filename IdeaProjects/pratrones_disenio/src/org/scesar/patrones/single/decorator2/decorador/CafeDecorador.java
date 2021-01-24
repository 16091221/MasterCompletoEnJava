package org.scesar.patrones.single.decorator2.decorador;

import org.scesar.patrones.single.decorator2.Configurable;

 abstract public class CafeDecorador implements Configurable {
     protected Configurable cafe;

     public CafeDecorador(Configurable cafe) {
         this.cafe = cafe;
     }
 }
