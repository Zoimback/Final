/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 * @version 1.0 codigo
 * @author Alejandro Rodriguez
 */
public class Operaciones {

    public int sumarPar(int a, int b) {
        /**
         * El metodo SumaPar se encarga de sumar dos enteros (a,b), cogiendo el
         * resultado de esta y dividiendolo entre dos. Si el resto es igual a 0
         * se le sumara uno a la suma, si es distinto se queda igual.
         *
         * @param a integer
         * @param b integer
         * @return resultado de sumar a y b
         */

        int resultado = a + b;
        if (resultado % 2 == 0) {
            return resultado;//cambio la posicion del + 1;
        } else {
            return resultado + 1;
        }
    }

    public int mayor(int a, int b) {
        /**
         * El metodo mayor obtiene los parametros a y b, comprueba cual de los
         * dos es mayor a traves del if.
         *
         * @param a integer
         * @param b integer
         * @return Devuelve el numero mayor
         */
        if (a > b) {
            return a;
        } else if (a == b) {
            return a;
        }else{
            return b;
    }
}

public int sumarVector(int [] numeros) {
        /**
         * El metodo sumarVector recibe una cadena de arrays y a traves del for se encarga de sumarlos
         * 
         * @param sum integer
         * @param numeros array de enteros
         * @return suma de los valores del array
         */
        int sum=0;
        for (int i = 0; i < numeros.length; i++) {
            sum+=numeros[i];
        }
        return sum;
    }
    
}
