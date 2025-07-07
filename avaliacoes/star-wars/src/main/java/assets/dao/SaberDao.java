package assets.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assets.model.Saber;

public class SaberDao {
    private List<Saber> sabers;
    private Scanner scanner;
    private final String FILE_PATH = ""; // file path precisa literalmente ser o caminho absoluto, nesse commit eu nao vou botar para segurança

    public SaberDao() {
        this.sabers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        carregarOArquivo();
    }

    public void carregarOArquivo() { // privado pois só o construtor deve chamar
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Saber saber = Saber.fromString(linha);
                if (saber != null) {
                    sabers.add(saber);
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado. Será criado ao salvar.");
        }
    }

    public List<Saber> getAllSabers() {
        sabers.clear();
        carregarOArquivo();
        return new ArrayList<>(sabers);
    }

    private void salvarNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Saber saber : sabers) {
                writer.write(saber.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar sabers: " + e.getMessage());
        }
    }

    public void addSaber(Saber saber) {
        sabers.add(saber);
        salvarNoArquivo();
    }

    public Saber getSaberByColor(String color) {
        for (Saber saber : sabers) {
            if (saber.getDescricao().equalsIgnoreCase(color)) {
                return saber;
            }
        }
        return null;
    }

    public void removeSaber(Saber saber) {
        sabers.remove(saber);
        salvarNoArquivo();
    }

    public Saber getSaberByName(String name) {
        for (Saber saber : sabers) {
            if (saber.getDescricao().equalsIgnoreCase(name)) {
                return saber;
            }
        }
        return null; 
    }

    public void removeSaber(String description) {
        System.out.println("Removendo Sabre: ");
        String name = scanner.nextLine();
        sabers.removeIf(saber -> saber.getDescricao().equalsIgnoreCase(name));
        salvarNoArquivo();
    }
}
