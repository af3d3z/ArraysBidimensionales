package ej3;

import java.util.Arrays;

public class Ejercicio3 {
    static void multiplicador(int[][] tabla) {
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] *= 10;
            }
        }
    }

    public static void main(String[] args) {
        int[][] tabla = {{2, 5, 6}, {9, 5, 2}};
        multiplicador(tabla);
        System.out.println(Arrays.deepToString(tabla));
    }
}
