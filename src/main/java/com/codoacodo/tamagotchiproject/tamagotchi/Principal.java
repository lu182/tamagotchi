package com.codoacodo.tamagotchiproject.tamagotchi;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para crear su Tamagotchi, coloquele un nombre:");
        String name = scanner.nextLine();

        System.out.println("Coloque un estado a su mascota virtual:");
        String state = scanner.nextLine();

        //Creo Tamagotchi
        Tamagotchi tama = new Tamagotchi(name, state);

        //Consulto estado
        System.out.println(name + " está: " + tama.getEstado());

        //Le doy de comer
        tama.comer();

        //Consulto estado nuevamente
        System.out.println("Luego de comer, " + name + " está: " + tama.getEstado() + " y su nivel es: " +
                tama.getNivel());

        /*--------------------------------------------------------------------------------------------------------*/
        System.out.println("------------------------------------------------------------");

        //Consulto estado
        System.out.println(name + " está: " + tama.getEstado());

        //La hago jugar
        tama.jugar();

        //Consulto estado nuevamente
        System.out.println("Luego de jugar, " + name + " está: " + tama.getEstado() + " y su nivel es: " +
                tama.getNivel());

        /*Tamagotchi tama = new Tamagotchi();
        tama.setNombre("Leia");
        tama.setEstado("hambrienta");
        */

    }
}
