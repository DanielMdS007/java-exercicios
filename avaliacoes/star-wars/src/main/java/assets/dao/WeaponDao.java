package assets.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assets.model.Weapon;

public class WeaponDao {
    private final List<Weapon> weapons;
    private Scanner scanner;
    public WeaponDao() {
        this.weapons = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public List<Weapon> getAllWeapons() {
        return weapons;
    }

    public Weapon getWeaponByDescription(String description) {
        for (Weapon weapon : weapons) {
            if (weapon.getDescricao().equalsIgnoreCase(description)) {
                return weapon;
            }
        }
        return null;
    }

    public void removeWeapon(String description) {
        weapons.removeIf(weapon -> weapon.getDescricao().equalsIgnoreCase(description));
    }
}
