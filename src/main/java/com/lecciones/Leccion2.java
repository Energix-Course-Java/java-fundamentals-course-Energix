package com.lecciones;
import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vidaHeroe = 100;
        int vidaMonstruo = 75;

        System.out.println("¡Bienvenido a la batalla!");
        System.out.println("Un Goblin salvaje ha aparecido");

        System.out.println("\n¿Que haras?");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.print("Elige: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("¡Has atacado al Goblin!");
            vidaMonstruo = vidaMonstruo - 105;
            System.out.println("Vida del Goblin: " + vidaMonstruo);
            if (vidaMonstruo <= 0) {
                System.out.println("¡Has derrotado al Goblin!");
            } else {
                System.out.println("El Goblin te ha atacado");
                vidaHeroe = vidaHeroe - 15;
                System.out.println("Vida del Heroe: " + vidaHeroe);
            }
        } else {
            System.out.println("Te has defendido");
            System.out.println("Recibes menos daño");
        }
    }
}
