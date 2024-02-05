package ej10;

import java.util.Arrays;

public class Ejercicio10 {
    public static int[][] gira90(int[][] tablaInicio){
        int[][] tablaGirada = transposicion(tablaInicio);

        for(int i = 0; i < tablaGirada.length; i++) {
            tablaGirada[i] = rotate(tablaGirada[i]);
        }

        return tablaGirada;
    }

    public static int[] rotate(int[] array) {
        int[] arrayRotado = new int[array.length];
        // variable que temporalmente guardará un índice
        int tmp = array.length-1;

        for(int i = 0; i < array.length; i++) {
            arrayRotado[i] = array[tmp];
            tmp--;
        }

        return arrayRotado;
    }

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
        System.out.println(Arrays.toString(rotate(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.deepToString(gira90(new int[][] {{1, 2, 3}, {5, 6, 7}})));
    }

}
