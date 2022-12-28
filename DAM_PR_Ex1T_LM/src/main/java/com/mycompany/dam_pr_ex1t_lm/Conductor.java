package com.mycompany.dam_pr_ex1t_lm;

import java.time.LocalDate;

public class Conductor {

    String nombre;
    LocalDate fechaNacimiento, fechaCarnet;
    int puntos;
    boolean carnetRetirado;

    public Conductor(String nombreCond, LocalDate fechaNacimientoCond, LocalDate fechaCarnetCond) {
        nombre = nombreCond;
        fechaCarnet = fechaCarnetCond;
        fechaNacimiento = fechaNacimientoCond;
        puntos = 12;
        carnetRetirado = false;
    }

    static void faltaLeve(Conductor Cond) {
        double multa = 0;
        // Los siguientes if definirán cuándo aumentar la multa en función de la edad y de si el conductor es novel o tiene el carnet retirado, al igual que los del método faltaGrave
        // También servirán para 
        if (Cond.carnetRetirado == true) {
            multa = multa + 10000;
        }
        // La siguiente condición calculará, mediante la clase LocalDate, el tiempo transcurrido después de sumarle un tiempo a nuestra fecha(fechaCarne) y nos devolverá un booleano
        if (Cond.fechaCarnet.plusYears(2).isBefore(LocalDate.now())) {
            multa = multa + 50;
            Cond.puntos = Cond.puntos - 3;
        } else {
            multa = multa + 75;
            Cond.puntos = Cond.puntos - 4;
        }
        if (Cond.fechaNacimiento.plusYears(30).isBefore(LocalDate.now())) {
            multa = multa * 1.5;
        }
        if (Cond.puntos <= 0) {
            System.out.println("Sus puntos han llegado a 0, hay que retirarle el carnet");
            Cond.carnetRetirado = true;
        }
        System.out.println("Tiene una multa de " + multa);
        System.out.println("Sus puntos ahora son " + Cond.puntos);
    }

    static void faltaGrave(Conductor Cond) {
        double multa = 0;
        if (Cond.carnetRetirado == true) {
            multa = multa + 10000;
        }
        Cond.puntos = Cond.puntos - 10;
        if(Cond.fechaCarnet.plusYears(2).isBefore(LocalDate.now()) || Cond.fechaNacimiento.plusYears(30).isBefore(LocalDate.now())){
            multa = multa  + 10000 * 1.5;
        } else{
            multa = multa + 10000;
        }
        if (Cond.puntos <= 0) {
            System.out.println("Sus puntos han llegado a 0, hay que retirarle el carnet");
            Cond.carnetRetirado = true;
        }
        System.out.println("Tiene una multa de " + multa);
        System.out.println("Sus puntos ahora son " + Cond.puntos);
    }
    
    @Override
    public String toString(){
        return this.nombre + " tiene " + this.puntos + " puntos";
    }
}
