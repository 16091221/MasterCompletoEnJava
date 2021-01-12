public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //0b sistema binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; // anteponer 0 para convertir al sistema octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; //0x para interpretar un numero hexadecimal
        System.out.println("numeroHex = " + numeroHex);
    }
}
