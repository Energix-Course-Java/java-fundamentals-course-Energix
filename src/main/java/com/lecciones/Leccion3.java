package com.lecciones;
import java.util.Scanner;

   public class Leccion3 {
       public static void vidas(String[] args) {
           Scanner sc = new Scanner(System.in);

           int vidaHeroe = 100;
           String[] enemigos = {"Murcielago", "Goblin", "Zombie"};

           System.out.println("=== MAZMORRA ===");
           System.out.println("Hay " + enemigos.length + " enemigos\n");

           for (int i = 0; i < enemigos.length; i++) {
               System.out.println("--- Batalla " + (i + 1) + " ---");
               System.out.println("Enemigo: " + enemigos[i]);

               int vidaEnemigo = 30;

               while (vidaEnemigo > 0 && vidaHeroe > 0) {
                   System.out.println("\n1. Atacar");
                   System.out.print("Accion: ");
                   int accion = sc.nextInt();

                   if (accion == 1) {
                       vidaEnemigo = vidaEnemigo - 20;
                       System.out.println("Atacaste! Vida enemigo: " + vidaEnemigo);

                       if (vidaEnemigo > 0) {
                           vidaHeroe = vidaHeroe - 10;
                           System.out.println("Te atacaron! Tu vida: " + vidaHeroe);
                       }
                   }
               }

               if (vidaHeroe <= 0) {
                   System.out.println("\nGAME OVER");
                   return;
               }
               System.out.println("Enemigo derrotado!\n");
           }

           System.out.println("COMPLETASTE LA MAZMORRA!");
       }
   }
