package com.mycompany.algoritmos_y_estructura_de_datos.algoritmos;

//La busqueada lineal se puede realizar en lista ordenadas y lista no ordenadas
// Imagine un columna de papel y necesita encontrar un hoja en especifico
// para ello va ir buscando desde la primera hoja y lo va a comparar con la hoja que busca a su lado
// si no es la correcta pasa a la siguiente hoja hasta encontrarlo
//en caso de no encontrarlo retorna un null o no existe elemento.
public class BusquedaLineal {


    public static String buscar(int[] arr , int ojetivo) {

        for( int i=0; i<arr.length; i++ ){

            if(arr[i] == ojetivo) {

                return "El objetivo fue encontrado y es: " + arr[i] + " en la posición del arreglo:  " + (i+1);
            }}
        return "El objetivo: " + ojetivo + " no fue encontrado o no existe.";
    }



    public static void main( String args[]){

        int[] listaEdades= {2,34,23,12,34,54,12,34,5,12,32,5,12,345,12,14,15,16,17};
        int objetivo = 4;

        String resultado = buscar(listaEdades, objetivo);

        System.out.println(resultado);


        //
    }


}
