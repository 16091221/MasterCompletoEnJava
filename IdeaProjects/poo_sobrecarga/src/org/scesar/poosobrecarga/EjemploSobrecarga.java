package org.scesar.poosobrecarga;
import static org.scesar.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10.0f, 5f));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0f));
        System.out.println("sumar double: " + sumar(10.0, 10.0));
        System.out.println("sumar string: " + sumar("10", "5"));
        System.out.println("sumar  tres int: " + sumar(10, 5, 3));
        System.out.println("sumar 4 int: " + sumar(10, 5, 3, 4));
        System.out.println("sumar  int: " + sumar(10, 5, 3, 4, 5, 6));
        System.out.println("sumar float + n int: " + sumar(10.5f,5, 9, 15));
        System.out.println("sumar 4 double: " + sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("sumar long: " + sumar(10L, 5L));
        System.out.println("sumar int: " + sumar(10, '@'));
        System.out.println("sumar float-int: " + sumar(10f, '@'));
    }
}
