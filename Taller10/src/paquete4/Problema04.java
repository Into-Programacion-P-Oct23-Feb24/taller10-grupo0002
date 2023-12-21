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
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int fueraR = 0;
        double ingreso;
        double[][] datos = new double[2][2];
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
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%.2f\n",datos[i][j]);
            }
        }
        System.out.println("Numero de veces fuera de rango: " + fueraR);

    }
}
