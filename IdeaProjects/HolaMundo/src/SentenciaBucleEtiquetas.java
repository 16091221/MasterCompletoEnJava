public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {


        bucle:
        for (int i = 0; i <= 7; i++){

            int j = 0;
            while (j <= 8){

                if (i == 6 || i == 7) {
                    System.out.println("Dia" + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia" + i + ", trabajando a las" + j +"hr. ");
                j++;
            }
        }

        System.out.println("\n=================================================");

        bucle1:
        for (int i = 0; i < 5; i++){

            System.out.println();
            for(int j = 0; j < 5; j++) {

                if (i == 2) { // omite el 2
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j +"], ");
            }
        }

        System.out.println("\n=================================================");
        etiqueta:
        for (int i = 0; i < 5; i++){

            System.out.println();
            for(int j = 0; j < 5; j++) {

                if (i == 2) { // al llegar al 2 se sale
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j +"], ");
            }
        }
    }
}
