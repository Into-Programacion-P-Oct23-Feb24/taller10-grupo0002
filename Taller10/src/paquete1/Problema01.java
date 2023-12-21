/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments\
     *
     *
     * Dadas las notas de tres (3) estudiantes; generar una solución que permita
     * encontrar el promedio de las calificaciones por cada conjunto de notas de
     * los estudiantes. La problemática sugiere el uso de estructuras de datos.
     * Las notas están en un arreglo bidimensional llamado notas; notas tiene 3
     * filas y 4 columnas.
     *
     * Los nombres de los estudiantes están en un arreglo unidimensional que
     * tiene 3 elementos. El arreglo se llama estudiantes
     *
     * Atención; los valores del arreglo notas de la fila del índice 0
     * pertenecen al estudiante del índice 0 del arreglo estudiantes; y así con
     * cada fila de notas e índice de estudiantes
     *
     * Cada promedio de notas de un estudiante deberá ser almacenado en una
     * posición de un arreglo unidimensional llamado promedios; resaltar que el
     * arreglo promedios tendrá 3 elementos.
     *
     * Al final se debe presentar el siguiente reporte:
     *
     * Estudiante: Jerry Ponce tiene un promedio de ? Estudiante: Gabriela Lewis
     * tiene un promedio de ? Estudiante: David Bell tiene un promedio de ?
     *
     */
    public static void main(String[] args) {
        // Declarar las variables y arreglos
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        double suma;
        // Calculamos el promedio de cada estudiante
        for (int i = 0; i < notas.length; i++) {  // Filas
            suma = 0; // Regresa a 0
            for (int j = 0; j < notas[i].length; j++) { // Columnas
                suma += notas[i][j]; // Acumula las notas de x estudiante
            }
            promedios[i] = suma / 4; // Saca el promedio
        }
        // Se presenta el promedio de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    estudiantes[i],
                    promedios[i]);
        }

    }

}
