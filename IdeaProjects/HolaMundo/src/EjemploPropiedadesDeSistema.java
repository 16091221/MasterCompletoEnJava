import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); // Nombre de usuario del equipo (pc)
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home); //Ruta del usuario del sistema operativo
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        //String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator + "Una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);

    }
}
