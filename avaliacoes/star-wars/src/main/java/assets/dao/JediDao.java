package assets.dao;

import assets.model.Jedi;
import java.util.List;
import java.util.ArrayList; 
import java.util.Scanner;
public class JediDao {
    private List<Jedi> jedis;
    private Scanner scanner;

    public JediDao() {
        this.jedis = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addJedi(Jedi jedi) {
        jedis.add(jedi);
    }

    public List<Jedi> getAllJedis() {
        return jedis;
    }

    public Jedi getJediByName(String name) {
        for (Jedi jedi : jedis) {
            if (jedi.getNome().equalsIgnoreCase(name)) {
                return jedi;
            }
        }
        return null;
    }
    
    public void removeJedi(String name) {
        jedis.removeIf(jedi -> jedi.getNome().equalsIgnoreCase(name));
    }



}
