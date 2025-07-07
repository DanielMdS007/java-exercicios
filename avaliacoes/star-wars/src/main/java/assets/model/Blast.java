package assets.model;
public class Blast extends Weapon {

    public Blast(String descricao, int dano) {
        super(descricao, dano);
    }

    public void shot() {
        System.out.println("O blaster " +this.getDescricao() + " atirou!");
    }

    public static Blast fromString(String linha) {
        String[] partes = linha.split(" com dano ");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato inválido para Blast: " + linha);
        }
        String descricao = partes[0].trim();
        int dano;
        try {
            dano = Integer.parseInt(partes[1].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Dano inválido: " + partes[1].trim());
        }
        return new Blast(descricao, dano);
    }

}