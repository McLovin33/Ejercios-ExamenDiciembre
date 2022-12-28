package com.mycompany.dam_pr_ex1t_lm;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Infracciones_de_trafico {

    public static void main(String[] args) {
        //Definimos los conductores y creamos un conductorAuxiliar para simplificar el código
        Conductor conductor1 = new Conductor("Pepe", LocalDate.of(1979, Month.MARCH, 14), LocalDate.of(2006, Month.MARCH, 6));
        Conductor conductor2 = new Conductor("Pipo", LocalDate.of(1997, Month.JANUARY, 23), LocalDate.of(2016, Month.APRIL, 12));
        Conductor conductor3 = new Conductor("Pupi", LocalDate.of(1974, Month.FEBRUARY, 3), LocalDate.of(2021, Month.FEBRUARY, 5));
        Conductor condAux = new Conductor("", LocalDate.now(), LocalDate.now());
        int menu = 4;
        while (menu != 0) {
            menu = Infracciones_de_trafico.menu();
            if (menu == 1) {
                System.out.println("Introduzca el nombre del conductor a amonestar: ");
                sc.nextLine();
                String CondAmon = sc.nextLine();
                //Hacemos que el nombre de nuestro conductorAuxiliar sea igual a uno introducido por el usuario y consultamos si se trata de un conductor existente mediante un switch, si es así podemos llamar a los métodos apropiados(en este caso faltaLeve)
                switch(CondAmon){
                    case "Pepe" -> Conductor.faltaLeve(conductor1);
                    case "Pipo" -> Conductor.faltaLeve(conductor2);
                    case "Pupi" -> Conductor.faltaLeve(conductor3);
                    default -> System.out.println("Introduzca un nombre válido");
                }
            } else if (menu == 2) {
                //Volvemos a usar nuestro conductorAuxiliar para hacer la consultas y proceder con lo métodos
                System.out.println("Introduzca el nombre del conductor a amonestar: ");
                sc.nextLine();
                String CondAmon = sc.nextLine();
                switch(CondAmon){
                    case "Pepe" -> Conductor.faltaGrave(conductor1);
                    case "Pipo" -> Conductor.faltaGrave(conductor2);
                    case "Pupi" -> Conductor.faltaGrave(conductor3);
                    default -> System.out.println("Introduzca un nombre válido");
                }
            }
        }
        //Llamamos a los métodos toString() simplemente para visualizar los puntos con los que se quedan nuestro conductores
        System.out.println(conductor1.toString());
        System.out.println(conductor2.toString());
        System.out.println(conductor3.toString());
    }
    static Scanner sc = new Scanner(System.in);

    static int menu() {
        System.out.println("MENÚ INFRACCIONES DE TRÁFICO");
        System.out.println("-------------------------------");
        System.out.println("1.- Infracción Falta Leve");
        System.out.println("2.- Infracción Falta Grave");
        System.out.println("0.- Salir");
        System.out.println("Introduzca una opción valida");
        int menuopc = sc.nextInt();
        return menuopc;
    }
}
