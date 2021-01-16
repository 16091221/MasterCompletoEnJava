public class WrapperBoolean {
    public static void main(String[] args) {
        
        Integer num1, num2;
        num1 = 1;
        num2= 2;
        
        boolean primBoolean = num1 > num2; //primitivo
        Boolean objetoBoolean = Boolean.valueOf(primBoolean); //referencia
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("comparando dos objetos boolean: " + (objetoBoolean == objetoBoolean2)); //boolean comparado por el valor
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean: " + (objetoBoolean == objBoolean3));

        boolean primBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
    }

