package ej8;

public class Ejercicio8 {
    public static boolean esSimetrica(int[][] matriz) {
        boolean simetrica = true;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        return simetrica;
    }

    public static void main(String[] args) {
        System.out.println(esSimetrica(new int[][] {{2, 2}, {5, 8}}));
    }
}
