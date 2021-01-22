package org.scesar.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados: " + b);
        System.out.println(hs);
    }
}
