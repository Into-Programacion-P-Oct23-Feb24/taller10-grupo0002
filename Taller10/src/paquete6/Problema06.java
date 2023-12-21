/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        // Declarar variables y arreglos
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        int comparar = 0;
        // Este ciclo lo usamos para comparar el tamaño de el arreglo 
        // estudiantes en x posición y comprobamos si cumple la condición
        // para ser impreso 
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                comparar = estudiantes[i][j].length();
                if (comparar == 11) {
                    System.out.println(estudiantes[i][j]);
                }
            }
        }
    }
}
