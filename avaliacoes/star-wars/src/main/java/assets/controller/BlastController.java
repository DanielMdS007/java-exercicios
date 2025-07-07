package assets.controller;

import java.util.List;

import assets.dao.BlastDao;
import assets.model.Blast;
import assets.view.BlastView;

public class BlastController {
    private BlastDao blastDao;
    private BlastView blastView;
    private Blast blast;

    public BlastController() {
        this.blastDao = new BlastDao(); 
        this.blastView = new BlastView();
    }

    public void createBlast() {
        String descricao = blastView.getBlast();
        String[] parts = descricao.split(" com dano ");
        String nome = parts[0];
        int dano = Integer.parseInt(parts[1]);
        
        this.blast = new Blast(nome, dano);
        blastDao.addBlast(this.blast);
        BlastView.displayBlast(this.blast);
    }

    public void showBlasts() {
        List<Blast> blasts = blastDao.getAllBlasts();
        if (blasts.isEmpty()) {
            System.out.println("Nenhum Blaster cadastrado.");
        } else {
            System.out.println("== Lista de Blasters ==");
            for (Blast blast : blasts) {
                System.out.println();
                System.out.println("Nome: " + blast.getDescricao() + "\nDano: " + blast.getDano());
            }
        }
    }

    public Blast getBlastByName(String name) {
        Blast blast = blastDao.getBlastByName(name);
        if (blast != null) {
            blastView.displayBlast(blast);
        } else {
            System.out.println("Blaster não encontrado.");
        }
        return blast;
    }

}
