package ej4;

import java.util.Arrays;

public class Ejercicio4 {
    static void generarTablasMultiplicar(int[][] tablasMultiplicar){
        for(int i = 0; i < tablasMultiplicar.length; i++) {
            for(int j = 0; j < tablasMultiplicar[0].length; j++){
                tablasMultiplicar[i][j] = (i+1) * (j+1);
            }
        }
    }

    public static void main(String[] args) {
        int[][] tablasMultiplicar = new int[10][10];

        generarTablasMultiplicar(tablasMultiplicar);

        System.out.println(Arrays.deepToString(tablasMultiplicar));
    }
}
