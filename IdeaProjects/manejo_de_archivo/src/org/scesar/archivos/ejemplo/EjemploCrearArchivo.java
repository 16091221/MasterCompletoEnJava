package org.scesar.archivos.ejemplo;

import org.scesar.archivos.ejemplo.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Users\\Cesar\\Documents\\MasterCompletoEnJava\\archivo\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);


    }
}
