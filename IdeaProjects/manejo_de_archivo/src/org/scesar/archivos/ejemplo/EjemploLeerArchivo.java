package org.scesar.archivos.ejemplo;

import org.scesar.archivos.ejemplo.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Users\\Cesar\\Documents\\MasterCompletoEnJava\\archivo\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
