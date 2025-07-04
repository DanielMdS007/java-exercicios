package assets.view;
import java.util.Scanner;

import assets.model.Weapon;

public class WeaponView {
    private static Scanner sc = new Scanner(System.in);

    public static String getWeapon() {
        System.out.println("Nome da Arma: ");
        String descricao = sc.nextLine();
        System.out.println("Dano da Arma: ");
        int dano = sc.nextInt();

        return descricao + " com dano " + dano;
    }

    public static void displayWeapon(Weapon weapon) {
        System.out.println("Arma: " + weapon.getDescricao());
        System.out.println("Dano: " + weapon.getDano());
    }

    public static void displayAllWeapons(Weapon[] weapons) {
        for (Weapon weapon : weapons) {
            displayWeapon(weapon);
            System.out.println("-------------------");
            System.out.println("Arma: " + weapon.getDescricao());
            System.out.println("Dano: " + weapon.getDano());
            System.out.println("-------------------");
        }
    }

    public static Weapon drop() {
        System.out.println("Arma descartada");
        return null;
    }

    public static Weapon pickUp() {
        System.out.println("Arma adquirida");
        return null;
    }
}
