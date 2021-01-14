import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 5 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);
        
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota de matemáticas entre 2.0 - 7.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0");
        historia = scanner.nextDouble();

        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0");
        ciencias = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);
        
        estado = promedio >=5.49 ? "Aprobado":"Rechazado"; // Version abreviada del if-else
        System.out.println("estado = " + estado);


    }
}
