/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matricestotalmentedinamicasmultiplicacion_3_2_23;

import java.util.Scanner;

/**
 *
 * @author ll322
 */
public class matricesMultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escriba el tamaño de la matiz: ");
        int tamaño=entrada.nextInt();
        int miMatriz[][] = new int[tamaño][tamaño];
        int miMatriz2[][]=new int[tamaño][tamaño];
        int resulMatriz[][]=new int[tamaño][tamaño];
        for (int i = 0; i < miMatriz.length; i++) {
            for ( int j = 0; j < miMatriz.length; j++){
                miMatriz[i][j] = 0;
                miMatriz2[i][j]=0;
                resulMatriz[i][j]=0;
            }
        }
        System.out.println("Matriz Inicializada");
        for (int i = 0; i < miMatriz.length; i++) {
            for ( int j = 0; j < miMatriz[0].length; j++){
                miMatriz[i][j] = generarNumerosAleatorios(0,9);
                miMatriz2[i][j] = generarNumerosAleatorios(0,9);
                resulMatriz[i][j]=miMatriz[i][j]*miMatriz2[i][j];
                //System.out.println(miMatriz[i][j]+" ");
            }
        }
        System.out.println("Matriz 1");
        muestraMatriz(miMatriz);
        System.out.println("Matriz 2");
        muestraMatriz(miMatriz2);
        System.out.println("Resultado");
        muestraMatriz(resulMatriz);
    }
    public static void muestraMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for ( int j = 0; j < matriz[0].length; j++){
                System.out.println(matriz[i][j]+" ");
            }
        }
        System.out.println(" ");
    }
    public static int generarNumerosAleatorios(int min, int max){
            return (int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        }
    }  

