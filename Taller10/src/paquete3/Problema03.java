/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 *
 * Dado los siguiente arreglos; llene el arreglo notasCualitativas relacionando
 * las posiciones del arreglo notasCuantitativas. Tomar en consideración lo
 * siguiente
 *
 * String[][] notasCualitativas = new String[3][3]; double[][]
 * notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
 *
 * /*
 * Referencia para obtener el valor cualitativo de una nota numérica 0 - 2.9
 * Insuficiente 3 - 4.9 Regular 5 - 7.9 Buena 8 - 9.5 Muy Buena 9.6 - 10
 * Sobresaliente
 */
public class Problema03 {

    public static void main(String[] args) {
        // Declaramos un arreglo bidimencional notas cualitativas y 
        // arreglo bidimencional tipo decimal , notas Cuantitativas
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        // Ciclo for para notas cualitativas y cuantitativas 
        // si este  cumple entra al ciclo para comparar y presentar el mensaje 
        // de Insuficiente , Regular,Buena , Muy Buena , Sobresaliente
        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas[i].length; j++) {
                if (notasCuantitativas[i][j] >= 0) {
                    if (notasCuantitativas[i][j] <= 2.9) {
                        notasCualitativas[i][j] = "Insuficiente";
                    } else {
                        if (notasCuantitativas[i][j] >= 3 &&
                                notasCuantitativas[i][j] <= 4.9) {
                            notasCualitativas[i][j] = "Regular";
                        } else {
                            if (notasCuantitativas[i][j] >= 5 &&
                                    notasCuantitativas[i][j] <= 7.9) {
                                notasCualitativas[i][j] = "Buena";
                            } else {
                                if (notasCuantitativas[i][j] >= 8 &&
                                        notasCuantitativas[i][j] <= 9.5) {
                                    notasCualitativas[i][j] = "Muy Buena";
                                } else {
                                    if (notasCuantitativas[i][j] >= 9.6 &&
                                            notasCuantitativas[i][j] <= 10) {
                                        notasCualitativas[i][j] = "Sobresaliente";
                                    } else {
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        // Este ciclo lo usamos mediente el valor de notas cualitativas
        // para presentar en pantalla NOTA 7.10 Buena , etc .
        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas[i].length; j++) {
                System.out.printf("Nota %.2f es %s\n", 
                        notasCuantitativas[i][j] ,
                        notasCualitativas[i][j]);
            }
        }
    }
}
