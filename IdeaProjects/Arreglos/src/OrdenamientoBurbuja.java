import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;

        int contador = 0;

        for (int i = 0; i < total-1; i++){
            for (int j = 0; j < total-1-i; j++){
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){ //> 0 de mayor a menor
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chronecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        sortBurbuja(productos);
        System.out.println("==== Usando for ====");
        for(int i = 0; i < total; i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4]; //Crear instancia del arreglo

        numeros[0] = 10; //Asignar los valores
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("numeros[i] = " + numeros[i]);
        }

    }
}
