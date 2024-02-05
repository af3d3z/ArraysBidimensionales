package ej9;

public class Ejercicio9 {
    public static boolean esMagica (int[][] array) {
        // indica si la tabla es mágica
        boolean magica = true;
        // guarda la suma de la primera fila
        int sumaPrimeraFila = 0;
        // guarda la suma de la fila correspondiente
        int suma = 0;
        // se usan para iterar dentro del array a partir de la primera fila
        int k = 1;
        int p = 0;


        for(int i = 0; i < array[0].length; i++) {
            sumaPrimeraFila += array[0][i];
        }

        while(k < array.length && magica) {
            suma = 0;
            p = 0;
            while(p < array[0].length && magica){
                suma += array[k][p];
                p++;
            }
            if(suma != sumaPrimeraFila)
                magica = false;

            k++;
        }
        return magica;
    }

    public static void main(String[] args) {
        System.out.println(esMagica(new int[][]{{1, 2, 9}, {4, 5, 3}, {2, 3, 7}}));
    }
}
