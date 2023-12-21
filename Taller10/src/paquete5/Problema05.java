/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        // Declaracion de variables y arreglos
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String comparar= "";
        // Este ciclo lo usamos para comparar la primera letra de el arreglo 
        // estudiantes en x posición y comprobamos si cumple la condición
        // para ser impreso 
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                  comparar = estudiantes[i][j].substring(0, 1);
                  switch (comparar.toUpperCase()) {
                    case "S":
                    case "P":
                    case "T":
                           System.out.println(estudiantes[i][j]);
                        break;
                    default:
                }
            }
        }
    }
}
