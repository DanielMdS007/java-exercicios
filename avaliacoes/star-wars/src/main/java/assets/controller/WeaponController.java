package assets.controller;

import assets.model.Weapon;
import assets.view.WeaponView;

public class WeaponController {
    private Weapon weapon;
    public WeaponController() {
    }

    public void createWeapon() {
        String descricao = WeaponView.getWeapon();
        int dano = Integer.parseInt(descricao.split(" com dano ")[1]);
        descricao = descricao.split(" com dano ")[0];
        
        this.weapon = new Weapon(descricao, dano);
    }

    public WeaponController(Weapon weapon, WeaponView weaponView) {
        this.weapon = weapon;
    }

    public void showWeapon() {
        WeaponView.displayWeapon(weapon);
    }

    public void showAllWeapons(Weapon[] weapons) {
        WeaponView.displayAllWeapons(weapons);
    }
}
