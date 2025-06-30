package assets.controller;


import java.util.Scanner;

import assets.model.Jedi;
import assets.view.JediView;
public class JediController {
        private Jedi jedi;
        private JediView  jediView;
        public JediController() {
        }
        public void createJedi() {
            Scanner sc = new Scanner(System.in);
            String nome = JediView.getJediNome();
            String sobrenome = JediView.getJediSobrenome();
            String sexo = JediView.getJediSexo();
            String titulo = JediView.getJediTitulo();
            //String weapon = JediView.getJediWeapons();
            
            this.jedi = new Jedi(nome, sobrenome, sexo, titulo);
            //this.jedi.setWeapons(weapon);
        }
        public JediController(Jedi jedi, JediView jediView) {
            this.jedi = jedi;
            this.jediView = jediView;
        }
        
        public void showJedi() {
            jediView.displayJedi(jedi);
        }
        public void showAllJedis(Jedi[] jedis) {
            jediView.displayAllJedis(jedis);
        }



}
