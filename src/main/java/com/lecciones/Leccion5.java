package com.lecciones;

    class Heroe {
        String nombre;
        int vida;
        int ataque;

        public Heroe(String n, int v, int a) {
            nombre = n;
            vida = v;
            ataque = a;
        }

        public void mostrar() {
            System.out.println("\n=== " + nombre + " ===");
            System.out.println("Vida: " + "vida");
            System.out.println("Ataque: " + ataque);
        }

        public void atacar(Enemigo enemigo) {
            System.out.println(nombre + " ataca!");
            enemigo.recibirDanio(ataque);
        }
    }

    class Enemigo {
        String nombre;
        int vida;

        public Enemigo(String n, int v){
            nombre = n;
            vida = v;
        }

        public void recibirDanio(int danio) {
            vida = vida - danio;
            System.out.println(nombre + " recibe " + danio + " de danio");
            System.out.println("Vida enemigo: " + vida);
        }
        public boolean estaVivo() {
            return vida > 0;
        }
    }


    public class Leccion5 {
        public static void main(String[] args) {
            Heroe jugador = new Heroe("Warrior", 100, 25);
            Enemigo goblin = new Enemigo("Goblin", 50);

            jugador.mostrar();

            System.out.println("\n=== COMBATE ===");
            while (goblin.estaVivo()) {
                jugador.atacar(goblin);
            }
            System.out.println("\nVICTORIA!");
        }
    }

