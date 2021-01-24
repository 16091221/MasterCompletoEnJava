package org.scesar.patrones.single.factory.producto;

import org.scesar.patrones.single.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana(){
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizaza en triangulos grandes");
    }
}
