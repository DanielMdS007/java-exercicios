package assets;

public class Funcionario extends Pessoa{
    private String ctp;
    private String cargo;

    public Funcionario(){}
    public Funcionario(String nome, String cpf, String ctp, String cargo){
        super(nome,cpf);
        this.ctp=ctp;
        this.cargo=cargo;
    }
    
}
