package ej1;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        // definicion del array
        int[][] arrayNumeros = new int[3][6];

        // asignación de valores: primera subtabla
        arrayNumeros[0][0] = 0;
        arrayNumeros[0][1] = 30;
        arrayNumeros[0][2] = 2;
        arrayNumeros[0][5] = 5;

        // asignación de valores: segunda subtabla
        arrayNumeros[1][0] = 75;
        arrayNumeros[1][4] = 0;

        // asignación de valores: tercer subtabla
        arrayNumeros[2][2] = -2;
        arrayNumeros[2][3] = 9;
        arrayNumeros[2][5] = 11;

        System.out.println(Arrays.deepToString(arrayNumeros));
    }
}
