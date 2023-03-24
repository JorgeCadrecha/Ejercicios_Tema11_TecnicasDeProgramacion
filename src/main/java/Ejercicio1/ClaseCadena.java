package Ejercicio1;

public class ClaseCadena {
    public static String devuelveIniciales(String nombreCompleto) {
        //isEmpty() devuelve true si la cadena esta vacia
        if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            return "";
        }
        //Gracias a .split() podemos separar la cadena por espacios en blanco y obtener
        //un array de String con cada una de las palabras
        String[] palabras = nombreCompleto.split(" ");
        //StringBuilder es una clase que nos permite concatenar Strings de forma eficiente
        StringBuilder iniciales = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                //.append() nos permite concatenar Strings
                //charAt(0) nos devuelve el primer caracter de la cadena
                iniciales.append(palabra.charAt(0)).append('.');
            }
        }
        return iniciales.toString();
    }
}

