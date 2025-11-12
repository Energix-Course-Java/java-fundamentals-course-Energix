package com.lecciones;
import java.util.Scanner;
//metodos sin parametros
// metodos con parametros
//metodos que retornen valores
public class Leccion4 {

    static int vida = 100;
    static int oro = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrarBienvenida();

        boolean jugando = true;

        while (jugando && estaVivo()){

            mostrarMenu();
            int opcion = sc.nextInt();

            if (opcion == 1) {
                explorar();
            }else if (opcion == 2){
                mostrarEstado();
            }else if (opcion == 3){
                descansar();
            }else if (opcion == 4){
                jugando = false;
            }

        }
        System.out.println("Gracias por jugar. ¡Hasta luego!");

    }
    //metodos sin parametros

    public static void mostrarBienvenida(){
        System.out.println("====RPG NO LINEAL====");
    }

    public static void mostrarMenu(){
        System.out.println("1. Explorar");
        System.out.println("2. Mostrar estado");
        System.out.println("3. Descansar");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void explorar(){
        System.out.println("Te encontraste con un enemigo!!");
        recibirDano(15);
        ganarOro(20);
        System.out.println("Vida: " + vida);
        System.out.println("Oro: " + oro);
    }

    public static void mostrarEstado(){
        System.out.println("Estado Actual del Jugador:");
        System.out.println("Vida: " + vida);
        System.out.println("Oro: " + oro);

    }

    public static void descansar(){
        vida = vida + 30;
        if(vida > 100) vida = 100;
        System.out.println("Descansaste, recuperaste : " + vida);
    }

    //metodos con parametros
    public static void recibirDano(int danoRecibido) {
        vida = vida - danoRecibido;
        System.out.println("¡Recibiste " + danoRecibido + " puntos de daño!");
    }

    public static void ganarOro(int oroGanado) {
        oro = oro + oroGanado;
        System.out.println("¡Ganaste " + oroGanado + " de oro!");
    }


    //metodo que retorna

    public static boolean estaVivo(){
        if(vida > 0){
            return true;
        } else {
            return false;
        }
    }

}
