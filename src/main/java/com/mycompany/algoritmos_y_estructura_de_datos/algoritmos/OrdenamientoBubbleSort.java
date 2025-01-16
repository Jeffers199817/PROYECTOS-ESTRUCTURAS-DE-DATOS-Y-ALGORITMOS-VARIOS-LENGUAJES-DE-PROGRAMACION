package com.mycompany.algoritmos_y_estructura_de_datos.algoritmos;

public class OrdenamientoBubbleSort {

    public static void BubbleSort(int[] arr){

        int n = arr.length;
        boolean intercambio;

        for(int i=0; i<n-1; i++) {
            intercambio = false;
            for( int j= 0 ; j<n-i-1; j++) {

                if(arr[j]> arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    intercambio = true;
                }

            }
            if(!intercambio) break;
        }


    }


    public static void main(String [] args){

        int[] lista = {23,45,25,34,62,465,13,45,34,62};

        BubbleSort(lista);
        System.out.println("Lista Ordenada: ");

        for(int i : lista) {
            System.out.print( i + " ");
        }


    }

}
