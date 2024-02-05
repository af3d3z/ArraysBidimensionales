package ej2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // aquí se guardarán los alumnos junto con sus calificaciones
        int[][] calificaciones = new int[4][5];
        Scanner sc = new Scanner(System.in);
        // guardará la media de cada alumno
        int[] media = new int[4];
        // guardará temporalmente la nota mínima de cada alumno
        int min = Integer.MAX_VALUE;
        // guardará termporalmente la nota máxima de cada alumno
        int max = 0;

        // iteramos primero por alumnos
        for(int nAlumno = 0; nAlumno < calificaciones.length; nAlumno++) {
            for(int nAsignatura = 0; nAsignatura < calificaciones[0].length; nAsignatura++){
                System.out.printf("Alumno Nº %d | Asignatura Nº %d \n", nAlumno+1, nAsignatura+1);
                calificaciones[nAlumno][nAsignatura] = sc.nextInt();
            }
        }

        System.out.println("Nº Asignatura\tNº Alumno\tNota");
        for(int nAlumno = 0; nAlumno < calificaciones.length; nAlumno++){
            for(int nAsignatura = 0; nAsignatura < calificaciones[0].length; nAsignatura++) {
                System.out.printf("%d\t\t\t\t\t%d\t\t%d\n", nAsignatura+1, nAlumno+1, calificaciones[nAlumno][nAsignatura]);
            }
        }

        for(int i = 0; i < calificaciones.length; i++) {
            for(int j = 0; j < calificaciones[0].length; j++){
                if(calificaciones[i][j] < min) {
                    min = calificaciones[i][j];
                }else if(calificaciones[i][j] > max){
                    max = calificaciones[i][j];
                }
                media[i] += calificaciones[i][j];
            }
            media[i] = (int) media[i] / calificaciones.length;
            System.out.printf("Media del alumno %d: %d\n", i+1, media[i]);
            System.out.printf("Nota mínima: %d \n", min);
            System.out.printf("Nota máxima: %d \n\n", max);
        }

    }
}
