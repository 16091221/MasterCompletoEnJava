package org.scesar.patrones.single.factory;

import org.scesar.patrones.single.factory.producto.PizzaCaliforniaPepperoni;
import org.scesar.patrones.single.factory.producto.PizzaCaliforniaQueso;
import org.scesar.patrones.single.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
