package com.mycompany.algoritmos_y_estructura_de_datos.algoritmos;

import java.sql.SQLOutput;

public class BusquedaBinaria {

    public static int buscar(int[] arr, int objetivc){

        int inicio =0;
        int fin = arr.length-1;
        System.out.println("Elemento fin: " + fin);
        System.out.println("Elemento inicio: " + inicio);

        while( inicio<= fin){
            System.out.println("el arreglo es: " + arr);
            for(int i=inicio; i<=fin ; i ++) {
                System.out.print(arr[i]+ ", ");
            }
            int medio = inicio + (fin-inicio)/2;
            System.out.println("Elemento medio es: " + medio);

            if(arr[medio]== objetivc){
                System.out.println("Arreglo medio: " + arr[medio] + " Objetivo es : " + objetivc);
                System.out.println("medio es: " + medio);
                return medio;
            }
            if(arr[medio] < objetivc){
                System.out.println("Arreglo medio: " + arr[medio] + " Es menor que" + " Objetivo es : " + objetivc);
                inicio = medio+1;
                System.out.println( "El nuevo inicio es: " + inicio);
                System.out.println("El fin se mantiene es: " + fin);
                System.out.println("SE ELIMINA PARTE INFERIOR");
                System.out.println("=============================================================================");
            }else{
                System.out.println("Arreglo medio: " + arr[medio] + " Es mayor que" + " Objetivo es : " + objetivc);
                fin = medio-1;
                System.out.println("El nuevo fin es: " + fin);
                System.out.println("El inicio se mantiene:" + inicio);
                System.out.println("SE ELEMINA PARTE SUPERIOR");
                System.out.printf("==============================================================================");
            }

        }
        return -1; // Devuelve -1 si no se encuentra


    }



    public static void main( String[] args){

            int[] listaEdades = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int objetivo = 8;

            int resultado = buscar(listaEdades, objetivo);

            if( resultado == -1){
                System.out.println("No se encontro el objetivo: " + objetivo);
            }else {
                System.out.println("El objetivo se encontro y esta en la posición: " + resultado);
            }
            }
}
