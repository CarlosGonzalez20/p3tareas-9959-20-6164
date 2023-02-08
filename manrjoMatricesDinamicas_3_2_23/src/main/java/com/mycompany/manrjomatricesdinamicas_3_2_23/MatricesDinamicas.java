/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manrjomatricesdinamicas_3_2_23;

import java.util.Scanner;

/**
 *
 * @author ll322
 */
public class MatricesDinamicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escriba el número de columnas deseada: ");
        int columnas=entrada.nextInt();
        int miMatriz[][] = new int[3][columnas];
        for (int i = 0; i < miMatriz.length; i++) {
            for ( int j = 0; j < miMatriz.length; j++){
                miMatriz[i][j] = 0;
            }
        }
        System.out.println("Matriz Inicializada");
        for (int i = 0; i < miMatriz.length; i++) {
            for ( int j = 0; j < miMatriz[0].length; j++){
                miMatriz[i][j] = generarNumerosAleatorios(0,9);
                System.out.println(miMatriz[i][j]+" ");
            }
        }
    }
    public static int generarNumerosAleatorios(int min, int max){
            return (int)Math.floor(Math.random()*(min-(max+1))+(max+1));
    }
    
}
