package com.proyecto;

import java.util.Scanner;

class Personaje {
    String nombre;
    int vida;
    int ataque;

    public Personaje(String n, int v, int a) {
        nombre = n;
        vida = v;
        ataque = a;
    }

    public void atacar(Personaje otro) {
        otro.vida = otro.vida - ataque;
        System.out.println(nombre + " ataca a " + otro.nombre);
        System.out.println("Dano: " + ataque);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

public class PF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== JUEGO RPG ===");
        System.out.print("Nombre de tu heroe: ");
        String nombre = sc.nextLine();

        Personaje heroe = new Personaje(nombre, 100, 20);
        int nivel = 1;
        int oro = 0;

        String[] enemigos = {"Murcielago", "Goblin", "Zombie", "Dragon"};

        for (int i = 0; i < enemigos.length; i++) {
            System.out.println("\n--- Nivel " + (i+1) + " ---");
            Personaje enemigo = new Personaje(enemigos[i], 40 + (i*10), 10 + (i*3));

            System.out.println("Aparecio: " + enemigo.nombre);

            while (heroe.estaVivo() && enemigo.estaVivo()) {
                System.out.println("\nTu vida: " + heroe.vida);
                System.out.println("Vida enemigo: " + enemigo.vida);
                System.out.println("\n1. Atacar");
                System.out.println("2. Huir");
                System.out.print("Accion: ");
                int accion = sc.nextInt();

                if (accion == 1) {
                    heroe.atacar(enemigo);

                    if (enemigo.estaVivo()) {
                        enemigo.atacar(heroe);
                    }
                } else {
                    System.out.println("Huiste!");
                    break;
                }
            }

            if (!heroe.estaVivo()) {
                System.out.println("\nGAME OVER");
                System.out.println("Llegaste al nivel " + (i+1));
                return;
            }

            if (!enemigo.estaVivo()) {
                System.out.println("\nVICTORIA!");
                oro = oro + 25;
                nivel = nivel + 1;
                heroe.vida = heroe.vida + 20;
                heroe.ataque = heroe.ataque + 5;
                System.out.println("Oro: " + oro);
                System.out.println("Subiste de nivel!");
            }
        }

        System.out.println("\n=== JUEGO COMPLETADO ===");
        System.out.println("Nivel final: " + nivel);
        System.out.println("Oro total: " + oro);
    }
}
