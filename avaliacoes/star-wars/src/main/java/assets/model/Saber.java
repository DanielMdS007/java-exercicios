package assets.model;
public class Saber extends Weapon {

    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }

    public void slash() {
        System.out.println("O sabre " + this.getDescricao() + " atacou!");
    }

    public static Saber fromString(String linha) {
        String[] partes = linha.split(" com dano ");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato inválido para Saber: " + linha);
        }
        String descricao = partes[0].trim();
        int dano;
        try {
            dano = Integer.parseInt(partes[1].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Dano inválido: " + partes[1].trim());
        }
        return new Saber(descricao, dano);
    }

}