/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DeathStar
 */
public class LogicaCombate {
    
    public static void main(String[] args) {

        int vidaEnemigo = 40;
        int ataque = 35;
        int nivelJugador = 6;

        int bonificacion = (nivelJugador >= 5) ? 10 : 0;

        int danoTotal = ataque + bonificacion;
        int vidaRestante = vidaEnemigo - danoTotal;

        if (vidaRestante <= 0) {
            System.out.println("Enemigo derrotado! +50 XP");
        } else if (vidaRestante <= 20) {
            System.out.println("Enemigo en estado critico");
        } else {
            System.out.println("Enemigo resiste. Vida restante: " + vidaRestante);
        }

        // BUG A CORREGIR
        String clase = "Guerrero";

        if (clase.equals("Guerrero")) {
            System.out.println("Ataque cuerpo a cuerpo");
        }
    }
}
