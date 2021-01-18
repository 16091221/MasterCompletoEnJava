public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1); //-1 cuando ocurre un error
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n°= " + i + ": " + args[i]);
        }

        // javac "Nombre de la clase".java para compilar y genera el .class
        // agregar al final -encoding utf8 para recibir caracteres especiales
        // java "Nombre de la clase"
    }
}
