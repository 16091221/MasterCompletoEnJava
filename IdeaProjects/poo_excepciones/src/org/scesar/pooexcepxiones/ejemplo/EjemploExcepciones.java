package org.scesar.pooexcepxiones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String numerador = JOptionPane.showInputDialog("ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("ingrese un entero denominador: ");
        int divisor;
        double division;
        try {
           /*divisor = Integer.parseInt(valor);
           division =  calc.dividir(10, divisor);
            System.out.println("division = " + division);*/

            double division2 = calc.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepción: ingrese un valor numérico " + nfe.getMessage());
            main(args);
        }
        catch (FormatoNumeroException e){
            System.out.println("Se detecto una excepción ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
        }finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos el flujo de nuestra aplicación");

    }
    
}
