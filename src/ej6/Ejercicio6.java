package ej6;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
    static int[][] generarAleatorios (){
        // guardará los números aleatorios en este array
        int[][] numerosAleatorios = new int[6][10];
        // usaremos el objeto random para generar los números como tal
        Random rand = new Random();

        for(int i = 0; i < numerosAleatorios.length; i++){
            for(int j = 0; j < numerosAleatorios[0].length; j++) {
                numerosAleatorios[i][j] = rand.nextInt(0, 1001);
            }
        }

        return numerosAleatorios;
    }


    public static int[] minimoMaximo (int[][] array) {
        int[] minMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] < minMax[0]) {
                    minMax[0] = array[i][j];
                }else if(array[i][j] > minMax[1]){
                    minMax[1] = array[i][j];
                }
            }
        }
        return minMax;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minimoMaximo(generarAleatorios())));
    }
}
