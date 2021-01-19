public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7},
        };

        int i, j;


       /* salir: while (i < matriz.length){
            j = 0;
            while (j < i){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }*/

        salir: for (i = 0; i < matriz.length; i++){
            j = 0;
            for (j = 0; j < i; j++){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
            }
        }

        /*while (i < matriz.length && simetrica == true){
            j = 0;
            while (j < i && simetrica == true){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }*/

        if (simetrica){
            System.out.println("La matriz es simétrica");
        }
        else {
            System.out.println("La matriz no es simétrica");
        }

    }
}
