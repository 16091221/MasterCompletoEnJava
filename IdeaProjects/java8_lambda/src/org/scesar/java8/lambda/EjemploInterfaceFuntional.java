package org.scesar.java8.lambda;

import org.scesar.java8.lambda.aritmetica.Aritmetica;
import org.scesar.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuntional {
    public static void main(String[] args) {

        Aritmetica suma = (a, b) -> a + b;
        Aritmetica resta = (a, b) -> a -b;

        Calculadora calc = new Calculadora();

        System.out.println(calc.computar(10, 5, suma));
        System.out.println(calc.computar(10, 5, resta));
        System.out.println(calc.computar(10, 5, (a, b) -> a * b));

        System.out.println(calc.computarConBiFunction(10, 5, (a,b) -> a+b));
    }
}
