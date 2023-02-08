/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vectores_01_02_23;

import java.util.Scanner;

/**
 *
 * @author ll322
 */
public class vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaDatos= new Scanner (System.in);
        float promedioDatos=0,sumaDatos=0;
        int numMenor=0,numMayor=0;
        int[]miVector=new int[5];
        for(int i=0;i<miVector.length;i++){
            miVector[i]=0;
        }
        System.out.println("Vector inicializado!!");
        //ingreso datos del usuario
        for(int i=0;i<miVector.length;i++){
            System.out.println("Ingrese el número en la posición "+i+": ");
            miVector[i]=entradaDatos.nextInt();
        }
        for(int i=0;i<miVector.length;i++){
            sumaDatos+=miVector[i];
            if(numMayor<miVector[i]){
                numMayor=miVector[i];
            }
            System.out.println(String.format("Posición [%d] Elemento: %d", i, miVector[i]));
        }
        numMenor=numMayor;
        for(int i=0;i<miVector.length;i++){
            if(numMenor>miVector[i]){
                numMenor=miVector[i];
            }
        }
        promedioDatos=sumaDatos/miVector.length;
        System.out.println("Resultados analisis del vector");
        for(int i=0;i<miVector.length;i++){
            int contadorDatos=0;
            for(int j=0;j<miVector.length;j++){
                if(miVector[i]==miVector[j]){
                    contadorDatos++;
                }
            }
            System.out.println(String.format("El numero %d se repite %d veces", miVector[i], contadorDatos));
        }
        System.out.println(String.format("La suma de los datos es: %.2f, El promedio de los datos es: %.2f, El numero mayor es: %d, El numero menor es: %d", sumaDatos,promedioDatos,numMayor,numMenor));
    }
    
}
