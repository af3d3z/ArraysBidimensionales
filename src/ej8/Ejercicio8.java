package ej8;

public class Ejercicio8 {
    public static boolean esSimetrica(int[][] matriz) {
        boolean simetrica = true;
        int k = 0;
        int p = 0;

        while(k < matriz.length && simetrica) {
            p = 0;
            while(p < matriz[0].length && simetrica) {
                if(matriz[k][p] != matriz[p][k]){
                    simetrica = false;
                }
                p++;
            }
            k++;
        }

        return simetrica;
    }

    public static void main(String[] args) {
        System.out.println(esSimetrica(new int[][] {{7, 4}, {4, 7}}));
    }
}
