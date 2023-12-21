/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 *
 * Problema2
 *
 * Se requiere ingresar las ventas totales diarias de 2 vendedores; realizadas
 * de lunes a viernes. Los vendedores están representados en una estructura
 * unidimensional de dos elementos. El arreglo se llama vendedores
 *
 * El arreglo bidimensional que permitirá almacenar las ventas diarias tiene 2
 * filas y 5 columnas. El arreglo se llama ventas
 *
 * Existe una relación entre el índice 0 del arreglo vendedores y la fila de
 * índice 0 del arreglo ventas.
 *
 * Luego de ingresar los valores se necesita presentar el total de ventas de
 * todos los vendedores de la siguiente forma:
 *
 * Vendedor(a) Jessica Cole Vendedor(a) Robert Wallace Ha realizado un total de
 * ? en ventas.
 *
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Primero declaramos valores tipo decimal un arreglo unidimensional,
        // vendedores unidimensionales, ventas bidimensionales de tipo decimal.
        double total = 0;
        String acumulador="";
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        // Ingreso y guardado de datos de las ventas.
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ventas de "+vendedores[i]);
                ventas[i][j] = entrada.nextDouble();
            }
        }
        // Estamos sumando las filas y las columnas de los datos ingresados de 
        // cada posición y guardamos todos estos valores en total.
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
            acumulador +="Vendedor(a)"+ vendedores[i]+"\n";
        }
        // Al final presentamos el acumulador mas el total.
        System.out.printf("%sHa realizado un total de %.2f en ventas\n",
                acumulador,
                total);
    }
}
