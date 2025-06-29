package assets.model;
import java.util.ArrayList;


public class Sith extends Pessoa implements Force {
    
    private String titulo = "Sith";
    private ArrayList<Weapon> weapons;

    public Sith() {
        super();
        this.weapons = new ArrayList<>();
    }

    public Sith(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.weapons = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void mindControl() {
        System.out.println("[Sith]: Controle mental ativado");

    }

    @Override
    public void farseeing() {
        System.out.println("[Sith]: Visão amplificada");

    }

    @Override
    public void telepath() {
        System.out.println("[Sith]: Telepatia ativada");

    }

    @Override
    public void levitation() {
        System.out.println("[Sith]: Levitação ativada");

    }

    public void lightning() {

    }

    
}
