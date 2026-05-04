/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JHON MONTAÑO
 */

public class SimuladorRPG {

    public static int combatir(int vidaHero, int ataqueHero, int defensaHero,
                               int vidaEnemigo, int ataqueEnemigo) {

        while (vidaHero > 0 && vidaEnemigo > 0) {

            int danoHero = ataqueHero;
            vidaEnemigo -= danoHero;

            if (vidaEnemigo > 0) {
                int danoEnemigo = ataqueEnemigo - defensaHero;
                if (danoEnemigo < 1) danoEnemigo = 1;
                vidaHero -= danoEnemigo;
            }
        }

        return vidaHero;
    }

    public static void main(String[] args) {

        int vidaHero = 80;
        int ataqueHero = 18;
        int defensaHero = 8;
        int vidaMax = 80;

        String[] enemigos = {"Goblin", "Orco", "Dragon"};
        int[] vidas = {40, 70, 120};
        int[] ataques = {8, 14, 25};

        int derrotados = 0;

        for (int i = 0; i < enemigos.length; i++) {

            System.out.println("\n⚔ Peleando contra " + enemigos[i]);

            vidaHero = combatir(vidaHero, ataqueHero, defensaHero,
                                vidas[i], ataques[i]);

            if (vidaHero <= 0) {
                System.out.println("💀 Has muerto. FIN DEL JUEGO");
                break;
            } else {
                derrotados++;
                System.out.println("✅ Derrotaste a " + enemigos[i]);

                vidaHero += 20;
                if (vidaHero > vidaMax) {
                    vidaHero = vidaMax;
                }

                System.out.println("❤️ Vida actual: " + vidaHero);
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Enemigos derrotados: " + derrotados);
        System.out.println("Vida restante: " + vidaHero);

        if (derrotados == 3) {
            System.out.println("🏆 VICTORIA TOTAL");
        }
    }
}
