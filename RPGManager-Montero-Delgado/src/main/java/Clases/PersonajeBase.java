/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DeathStar
 */
public class PersonajeBase {
    
     String nombre = "Gandalf";
    int nivel = 5;
    double vida = 80.0;
    double vidaMaxima = 80.0;
    boolean estaVivo = true;
    String clase = "Mago";
    int mana = 120;
    int puntosAtaque = 20;
    int puntosDefensa = 8;

    public static void main(String[] args) {

        PersonajeBase p = new PersonajeBase();

        System.out.println(p.nombre + " [" + p.clase + "] Nv." + p.nivel +
                " | Vida: " + p.vida + " | Mana: " + p.mana);
    }
}
