/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JHON MONTAÑO
 */
import java.util.ArrayList;

public class Inventario {

    public static void main(String[] args) {

       
        ArrayList<String> inventario = new ArrayList<>();

        inventario.add("Espada de hierro");
        inventario.add("Pocion de vida");
        inventario.add("Escudo de madera");
        inventario.add("Llave dorada");

        System.out.println("=== INVENTARIO ===");

      
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }

        
        for (String item : inventario) {
            System.out.println("- " + item);
        }

        
        String buscar = "Pocion de vida";

        if (inventario.contains(buscar)) {
            System.out.println("[OK] " + buscar + " encontrada");
        } else {
            System.out.println("[X] " + buscar + " no disponible");
        }

        
        int vidaHero = 80;
        int vidaEnemigo = 60;
        int ronda = 1;

        System.out.println("\n=== COMBATE ===");

        while (vidaHero > 0 && vidaEnemigo > 0) {

            
            int danoHeroe = 15;
            vidaEnemigo -= danoHeroe;

            
            if (vidaEnemigo > 0) {
                int danoEnemigo = 10;
                vidaHero -= danoEnemigo;
            }

            System.out.println("Ronda " + ronda +
                    " -> Hero=" + vidaHero +
                    " | Enemigo=" + vidaEnemigo);

            ronda++;
        }

      
        if (vidaHero > 0) {
            System.out.println("VICTORIA!");
        } else {
            System.out.println("DERROTA");
        }

        
        int xp = 0;
        int nivel = 1;
        int xpNecesario = 100;

        int[] batallas = {20, 35, 15, 40, 30};

        System.out.println("\n=== PROGRESO XP ===");

        for (int xpGanado : batallas) {
            xp += xpGanado;

            System.out.println("Ganaste " + xpGanado + " XP (Total: " + xp + ")");

            if (xp >= xpNecesario) {
                nivel++;
                xp -= xpNecesario;
                System.out.println("🎉 Subiste a nivel " + nivel);
            }
        }

        System.out.println("Nivel final: " + nivel + " | XP restante: " + xp);
    }
}