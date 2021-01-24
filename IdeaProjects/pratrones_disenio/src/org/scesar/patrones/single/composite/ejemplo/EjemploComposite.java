package org.scesar.patrones.single.composite.ejemplo;

import org.scesar.patrones.single.composite.Archivo;
import org.scesar.patrones.single.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        System.out.println(doc.mostrar(0));
    }
}
