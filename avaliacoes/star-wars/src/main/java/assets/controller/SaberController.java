package assets.controller;

import java.util.List;

import assets.dao.SaberDao;
import assets.model.Saber;
import assets.view.SaberView;

public class SaberController {
    private SaberDao saberDao;
    private SaberView saberView;
    private Saber saber;

    public SaberController() {
        this.saberDao = new SaberDao(); 
        this.saberView = new SaberView();
    }

    public void createSaber() {
        String descricao = saberView.getSaber();
        String[] parts = descricao.split(" com dano ");
        String cor = parts[0];
        int dano = Integer.parseInt(parts[1]);
        
        this.saber = new Saber(cor, dano);
        saberDao.addSaber(this.saber);
        SaberView.displaySaber(this.saber);
    }

    public void showSabers() {
        List<Saber> sabers = saberDao.getAllSabers();
        if (sabers.isEmpty()) {
            System.out.println("Nenhum Sabre cadastrado.");
        } else {
            System.out.println("== Lista de Sabres =="); 
            for (Saber saber : sabers) {
                System.out.println();
                System.out.println("Cor: " + saber.getDescricao() + "\nDano: " + saber.getDano());
            }
        }
    }

    public Saber getSaberByColor(String color) {
        Saber saber = saberDao.getSaberByColor(color);
        if (saber != null) {
            SaberView.displaySaber(saber);
        } else {
            System.out.println("Sabre não encontrado.");
        }
        return saber;
    }

}
