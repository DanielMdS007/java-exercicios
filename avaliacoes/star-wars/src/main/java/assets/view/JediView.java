package assets.view;


import java.util.Scanner;
import assets.model.Jedi;
public class JediView {
    private static Scanner sc = new Scanner(System.in);
        public static void getJediNome() {
            System.out.println("Nome do Jedi: "  );
            String nome = sc.nextLine();
            System.out.println("Sobrenome do Jedi: " );
            String sobrenome = sc.nextLine();    
                
        }
        public static void getJediSexo() {
            System.out.println("Idade do Jedi: "  );
            String sexo = sc.nextLine();
        }
        public static void getJediTitulo() {
            System.out.println("Titulo do Jedi: "  );
            String titulo = sc.nextLine();
        }
        public static void getJediWeapons() {
            System.out.println("Armas do Jedi: "   );
            String weapon = sc.nextLine();
        }

        public void displayJedi(Jedi jedi) {
            System.out.println("Nome: " + jedi.getNome());
            System.out.println("Sobrenome: " + jedi.getSobrenome());
            System.out.println("Sexo: " + jedi.getSexo());
            System.out.println("Titulo: " + jedi.getTitulo());
            System.out.println("Arma: " + jedi.getWeapons());
        }

    public static void main(String[] args) {
        getJediNome();
        getJediSexo();
        getJediTitulo();
        getJediWeapons();
        ;



    }
}
