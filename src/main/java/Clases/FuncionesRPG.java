/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JHON MONTAÑO
 */
public class FuncionesRPG {

    public static int calcularDano(int ataque, int defensa) {
        int dano = ataque - defensa;
        return dano > 0 ? dano : 1;
    }

    public static double aplicarCuracion(double vida, double cur, double max) {
        double nueva = vida + cur;
        return nueva > max ? max : nueva;
    }

    public static void mostrarEstado(String nombre, double vida, int nivel) {
        System.out.println(nombre + " [Nv" + nivel + "] HP: " + (int)vida);
    }

    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {

        if (xpActual >= xpNecesario) {
            nivelActual++;
            xpActual = 0;
            System.out.println("¡Subiste de nivel! Ahora eres nivel " + nivelActual);
        }

        return nivelActual;
    }

    public static void main(String[] args) {

        int dano = calcularDano(20, 8);
        System.out.println("Dano: " + dano);

        double vida = aplicarCuracion(40, 80, 100);
        mostrarEstado("Frodo", vida, 3);

        int nivel = subirNivel(110, 100, 3);
        System.out.println("Nivel actual: " + nivel);

        int nivel2 = subirNivel(80, 100, 3);
        System.out.println("Nivel actual: " + nivel2);
    }
}
