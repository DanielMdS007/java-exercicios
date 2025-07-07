
import java.util.Scanner;

import assets.controller.JediController;
import assets.dao.JediDao;
public class App {
    public static void main(String[] args) {

        JediDao jediDao = new JediDao();
        jediDao.getAllJedis(); // Carrega os jedis do arquivo para a memória
        JediController jediController = new JediController();
        int decisao;
        Scanner scanner = new Scanner(System.in);
        //nesse jeito que estou fazendo, o jedi nao fica numa variavel permpétua, ele troca toda ver que um jedi é criado, eu acho que assim fica melhor caso tenha vários 
        System.out.println("Bem vindo ao Star Wars Jedi Manager!, escolha uma opção: \n[1] Criar Jedi\n[2] Listar todos os Jedis\n[3] Buscar Jedi por nome\n[4] Remover Jedi");
        decisao  = scanner.nextInt();

        switch (decisao) {
            case 1:
                jediController.createJedi();
                break;
            case 2:
                jediController.showJedi();
                break;
            case 3:
                
                System.out.println("Digite o nome do Jedi que deseja buscar: ");
                String nome = scanner.next();
                jediController.getJediByName(nome);
                break;
            case 4:
                jediDao.removeJedi();
                break;
            default:
                System.out.println("Opção inválida!");
        }

        



    }

}
    