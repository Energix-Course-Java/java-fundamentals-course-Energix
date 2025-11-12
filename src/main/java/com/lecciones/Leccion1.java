package com.lecciones;

public class Leccion1 {
    public static void main(String[] args){
        System.out.println("=== CREACION DE HEROE ===");

        String nombre= "Warrior";
        int vida=100;
        int ataque = 20;
        int nivel = 1;

        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Nivel: " + nivel);

        System.out.println("\n¡Encontraste el tesoro!");

        nivel = nivel + 1;
        vida = vida + 10;
        ataque = ataque + 5;

        System.out.println("\nSUBISTE DE NIVEL");
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);



    }
}
