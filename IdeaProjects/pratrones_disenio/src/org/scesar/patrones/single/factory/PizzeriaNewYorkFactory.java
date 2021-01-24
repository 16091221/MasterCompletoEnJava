package org.scesar.patrones.single.factory;

import org.scesar.patrones.single.factory.producto.PizzaNewYorkItaliana;
import org.scesar.patrones.single.factory.producto.PizzaNewYorkPepperoni;
import org.scesar.patrones.single.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
            producto = new PizzaNewYorkVegetariana();
            break;
            case "pepperoni" :
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana" :
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;
    }
}
