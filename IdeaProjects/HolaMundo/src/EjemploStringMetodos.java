import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "César";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"César\") = " + nombre.equals("César"));
        System.out.println("nombre.equals(\"César\") = " + nombre.equals("césar"));
        System.out.println("nombre.equalsIgnoreCase(\"césar\") = " + nombre.equalsIgnoreCase("césar"));
        System.out.println("nombre.compareTo(\"César\") = " + nombre.compareTo("César")); // si es 0 es identico
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //ésar
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3)); //es
        System.out.println("nombre.substring(3,5) = " + nombre.substring(3,5)); //ar

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace() = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());//borra los espacios en blanco


    }
}
