package ej5;

import java.util.Random;

public class Ejercicio5 {
    static int[][] generarAleatorios (){
        // guardará los números aleatorios en este array
        int[][] numerosAleatorios = new int[4][5];
        // usaremos el objeto random para generar los números como tal
        Random rand = new Random();

        for(int i = 0; i < numerosAleatorios.length; i++){
            for(int j = 0; j < numerosAleatorios[0].length; j++) {
                numerosAleatorios[i][j] = rand.nextInt(100, 1000);
            }
        }

        return numerosAleatorios;
    }

    static int sumatoriaTabla(int[][] array) {
        int sumatorio = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++) {
                sumatorio += array[i][j];
            }
        }

        for(int i = 0; i < array[0].length; i++) {
            for(int[] fila : array) {
                for(int valor : fila) {
                    sumatorio += valor;
                }
            }
        }

        return sumatorio;
    }

    public static void main(String[] args) {
        System.out.println(sumatoriaTabla(new int[][]{{2, 6, 5},{1, 2, 5}}));
    }

}
