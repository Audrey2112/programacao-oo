import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

// - Criando a classe ContatoDAO
public class ContatoDAO {

    // - Metodo para salvar um único contato no arquivo
    public void salvar(Contato contato) {
        List<String> lista = new ArrayList<>();
        lista.add(contato.toCSV()); // - Converte o contato para formato CSV

        try { // - Isso aqui evita que o programa trave e permite mostrar uma mensagem de erro
            Files.write(Paths.get("contatos.txt"), lista, StandardOpenOption.APPEND); // - Escreve no arquivo "contatos.txt", adicionando ao final (append)
        } catch (IOException e) {
            System.out.println("Erro ao salvar contato: " + e.getMessage()); // - Exibe mensagem de erro
        }
    }

    // - Metodo para salvar uma lista completa de contatos (sobrescreve o arquivo)
    public void salvar(List<Contato> contatos) {
        List<String> linhas = new ArrayList<>(); // - Lista com todas as linhas

        for (Contato c : contatos) {
            linhas.add(c.toCSV()); // - Adiciona cada contato convertido para CSV
        }

        try {
            Files.write(Paths.get("contatos.txt"), linhas); // - Salva todas as linhas no arquivo, substituindo o conteúdo existente
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista de contatos: " + e.getMessage()); // - Exibe mensagem de erro
        }
    }

    public List<Contato> carregar() { // - Metodo para carregar os contatos do arquivo (ainda não implementado)
        return new ArrayList<>(); // - Retorna lista vazia, para evitar erro de compilacao
    }
}
