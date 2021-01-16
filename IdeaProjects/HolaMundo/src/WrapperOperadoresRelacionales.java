public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        
        Integer num1 = Integer.valueOf(1080);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1080;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2)); // == compara por la instancia si es 127 o < comparara por valor

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2))); //compara por valor
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue())); // compara por valor

        //Auto unboxing
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        //Autoboxing
        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion = " + condicion2);


    }
}
