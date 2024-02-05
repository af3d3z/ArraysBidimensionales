package ej7;

import java.util.Arrays;

public class Ejercicio7 {
    public static int[][] transposicion(int[][] array) {
        int[][] arrayTranspuesto = new int[array[0].length][array.length];

        for(int i = 0; i < array[0].length; i++) {
            for(int j = 0; j < array.length; j++) {
                arrayTranspuesto[i][j] = array[j][i];
            }
        }

        return arrayTranspuesto;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {1, 9, 4}, {6,5,4}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(transposicion(array)));
    }
}
