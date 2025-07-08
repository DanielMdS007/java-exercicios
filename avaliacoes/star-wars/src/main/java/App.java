
import java.util.Scanner;

import assets.Menu;

public class App {
    public static void main(String[] args) {
        int decisao;
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        //nesse jeito que estou fazendo, o jedi nao fica numa variavel permpétua, ele troca toda ver que um jedi é criado, eu acho que assim fica melhor caso tenha vários 
        //Depois de criar o Sith, deixa que eu crio o menu para você :)
        while(continuar){
        System.out.println("Bem vindo ao Star Wars Manager!, escolha uma opção: \n[1] Jedi Manager\n[2] Sith Manager\n[3] Saber Manager\n[4] Blaster Manager");
        decisao  = scanner.nextInt();
        Menu menu = new Menu();

        switch (decisao) {
            case 1:
                menu.StartMenuJedi();
                break;
            case 2:
                menu.StartMenuSith();
                break;
            case 3:
                menu.StartMenuSaber();
                break;
            case 4:
                menu.StartMenuBlaster();
                break;
            case 5:
                System.out.println("Saindo do Star Wars Manager...");
                continuar = false;
                break; 
            default:
                System.out.println("Opção inválida!");
        }
    }
        



    }

}
    