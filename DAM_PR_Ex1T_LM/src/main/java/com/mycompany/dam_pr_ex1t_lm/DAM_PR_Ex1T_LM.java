package com.mycompany.dam_pr_ex1t_lm;

import java.util.Scanner;

public class DAM_PR_Ex1T_LM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaT = 0;
        boolean ValorValido = false;
        //Pedimos un valor para la altura válido hasta que el usuario lo introduzca bien
        //Cuando nuestras condiciones se cumplan se imprimirá el triángulo y parará el bucle definiendo ValorValido como true
        while (ValorValido == false) {
            if (alturaT <= 0) {
                System.out.println("Introduzca un valor positivo para la altura del triangulo: ");
                alturaT = sc.nextInt();
            } else {
                DAM_PR_Ex1T_LM.imprimirTriangulo(alturaT);
                ValorValido = true;
            }
        }
    }
    
    static void imprimirTriangulo(int AlturaTriangulo){
        String caracter;
        int numFilas, numColum;
        //Hemos declarado dos variables enteras y las igualamos a 0 para repetir un bucle mientras sean menores al número introducido por el usuario
        for(numFilas = 0; numFilas<=AlturaTriangulo; numFilas++){
            //Un segundo for hará que podamos aumentar el número de columnas que se imprime sin importar el de la fila e imprimos nuestro String caracter, que variará en función de la columna que toque imprimir
            for(numColum = 0; numColum<numFilas; numColum++){
                if (numColum % 2 == 0) {
                    caracter = "*";
                } else {
                    caracter = "-";
                }
                System.out.print(caracter + " ");
            }
            System.out.println("");
        }
    }
}
