import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){

        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chronecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos); //Orden alfabético
        arregloInverso(productos); //Orden Descendente

        //Collections.reverse(Arrays.asList(productos)); //Convierte a una lista

        System.out.println("==== Usando for ====");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }

    }
}
