/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        // Se declara el Scanner para ingreso de datos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Se declaran las variables y los arreglos
        int fueraR = 0;
        double ingreso;
        double[][] datos = new double[2][2];
        /**
         * Este ciclo lo usamos Para el ingreso de datos del usuario y la
         * comprobación de dicho dato entre en el rango de 1000 < x < 1999, si
         * no cumple con dicha condición datos en x posición el arreglo toma el
         * valor de 10 y fuera de rango aumenta en 1
         *
         */
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Ingrese un datos entre 1000-1999");
                ingreso = entrada.nextDouble();
                if (ingreso > 1000 && ingreso < 1999) {
                    datos[i][j] = ingreso;
                } else {
                    datos[i][j] = 10;
                    fueraR += 1;
                }
            }
        }
        // Este ciclo lo usamos para la presentación de datos del arreglo 
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%.2f\n", datos[i][j]);
            }
        }
        System.out.printf("Numero de veces fuera de rango: %s", fueraR);

    }
}
