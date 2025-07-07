package assets.view;

import java.util.Scanner;

import assets.model.Blast;

public class BlastView {
    private static Scanner sc = new Scanner(System.in);

    public static String getBlast() {
        System.out.println("Nome do Blaster: ");
        String descricao = sc.nextLine();
        System.out.println("Dano do Blaster: ");
        int dano = sc.nextInt();
        System.out.println("\n");

        return descricao + " com dano " + dano;
    }

    public static void displayBlast(Blast blast) {
        System.out.println("Blaster: " + blast.getDescricao());
        System.out.println("Dano: " + blast.getDano());
    }

    public static void displayAllBlasts(Blast[] blasts) {
        for (Blast blast : blasts) {
            displayBlast(blast);
            System.out.println("-------------------");
        }
    }
    
    public static void shot(Blast blast) {
        blast.shot();
        System.out.println("Blaster " + blast.getDescricao() + " disparou com dano de " + blast.getDano() + "!");
    }

    public static Blast drop() {
        System.out.println("Blaster descartado");
        return null;
    }

    public static Blast pickUp() {
        System.out.println("Blaster adquirido");
        return null;
    }

}
