public class EjemploStringValidar {
    public static void main(String[] args) {
        //Formas de validar un string
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // Forma más estricta y segura
        System.out.println("esBlanco = " + esBlanco);

        if (!esBlanco){
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
