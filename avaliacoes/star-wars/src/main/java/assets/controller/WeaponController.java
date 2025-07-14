package assets.controller;

import assets.dao.WeaponDao;
import assets.model.Weapon;
import assets.view.WeaponView;

public class WeaponController {
    private Weapon weapon;
    private WeaponDao weaponDao;
    private WeaponView weaponView;

    public WeaponController() {
        this.weaponDao = new WeaponDao(); // carrega armas.txt em memória
        this.weaponView = new WeaponView();
    }

    public void createWeapon() {
        String dono = WeaponView.getWeapon();
        String descricao = WeaponView.getWeapon();
        int dano = Integer.parseInt(descricao.split(" com dano ")[1]);
        descricao = descricao.split(" com dano ")[0];
        
        this.weapon = new Weapon(descricao, dano, dono);
    }

    public void showWeapon() {
        WeaponView.displayWeapon(weapon);
    }

    public void showAllWeapons(Weapon[] weapons) {
        WeaponView.displayAllWeapons(weapons);
    }

    public void removeWeapon() {
        weaponDao.removeWeapon();
    }
}
