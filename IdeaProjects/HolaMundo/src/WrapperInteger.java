public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto =  Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo; //auto boxing
        System.out.println("intObjeto = " + intObjeto);
        
        int num = intObjeto; //Implícita
        int num2 = intObjeto.intValue(); //Explícita
        System.out.println("num2 = " + num2);
        
        String valorTvLed = "67000";
        Integer valor = Integer.valueOf(valorTvLed);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto2.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();;
        System.out.println("longObjeto = " + longObjeto);
    }
}
