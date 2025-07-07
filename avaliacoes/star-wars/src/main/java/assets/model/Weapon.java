package assets.model;
public class Weapon {

    private String descricao;
    private int dano;
    
    public Weapon(String descricao, int dano) {

        this.descricao = descricao;
        this.dano = dano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Weapon drop() {
        return this;
    }

    public Weapon pickUp() {
        return this;
    }

    public static Weapon fromString(String nomeArma) {
        String[] partes = nomeArma.split(" com dano ");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato inválido para Weapon: " + nomeArma);
        }
        String descricao = partes[0].trim();
        int dano;
        try {
            dano = Integer.parseInt(partes[1].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Dano inválido: " + partes[1].trim());
        }
        return new Weapon(descricao, dano);
    }

}
