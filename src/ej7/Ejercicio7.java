package ej7;

import java.util.Arrays;

public class Ejercicio7 {
    public static int[][] transposicion(int[][] array) {
        for(int i = 0; i < array[0].length; i++) {
            for(int j = i; j < array.length; j++) {
                if(i != j) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {1, 9, 4}, {6,5,4}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(transposicion(array)));
    }
}
