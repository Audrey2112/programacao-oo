package ed04.dao;

import ed04.entidade.Contato;
import ed04.entidade.PessoaFisica;
import ed04.entidade.PessoaJuridica;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoCsvDAO implements ContatoDAO {

    @Override
    public List<Contato> getContatos() throws IOException {
        // Implementação para carregar contatos do arquivo CSV
        return carregar();
    }

    @Override
    public void inserir(Contato contato) throws IOException {
        // Implementação para salvar um contato no arquivo CSV
        salvar(contato);
    }

    @Override
    public void deletar(Contato contato) throws IOException {
        // Operação de exclusão não implementada para CSV
        throw new UnsupportedOperationException("Operação de exclusão não suportada para CSV.");
    }

    @Override
    public void atualizar(Contato contato) throws IOException {
        // Operação de atualização não implementada para CSV
        throw new UnsupportedOperationException("Operação de atualização não suportada para CSV.");
    }

    public void salvar(Contato contato) throws IOException {
        // Manipulação de arquivos
        // Caminhos (Path)
        //  - Absoluto: informa o caminho do arquivo a partir
        //              da raiz do sistema
        //              /home/chaua/poo/teste.txt
        //              C:\Users\chaua\poo\teste.txt
        //
        //  - Relativo: informa o caminho do arquivo a partir
        //              do diretório de execução
        //              poo/teste.txt

        List<String> lista = new ArrayList<>();
        lista.add(toCsv(contato));

        // Cria o arquivo caso ele não exista ainda
        Path arquivo = Paths.get("contatos.csv");
        if (!Files.exists(arquivo)) {
            Files.createFile(arquivo);
        }

        // Exceções!!!
        // write lança IOException => exceção tratada
        //  - ou trata
        //  - ou joga pra cima
        Files.write(Paths.get("contatos.csv"),
                lista,
                StandardOpenOption.APPEND);
    }

    public void salvar(List<Contato> contatos) throws IOException {
        // Salva uma lista de contatos no arquivo CSV
        List<String> lista = new ArrayList<>();
        for (Contato contato : contatos) {
            lista.add(toCsv(contato));
        }

        Path arquivo = Paths.get("contatos.csv");

        // Cria o arquivo caso ele não exista ainda
        if (!Files.exists(arquivo)) {
            Files.createFile(arquivo);
        }

        // Escreve os dados no arquivo, adicionando ao final
        Files.write(Paths.get("contatos.csv"),
                lista,
                StandardOpenOption.APPEND);

    }

    public List<Contato> carregar() throws IOException {
        // Carrega os contatos do arquivo CSV
        List<Contato> contatos = new ArrayList<>();

        Path arquivo = Paths.get("contatos.csv");

        // Verifica se o arquivo existe antes de tentar ler
        if (Files.exists(arquivo)) {
            List<String> linhas = Files.readAllLines(arquivo);

            // Itera sobre as linhas do arquivo e cria objetos Contato
            for (String linha : linhas) {
                String[] tokens = linha.split(",");

                // Se a linha for de pessoa fisica, instancia uma nova pessoa fisica
                if (tokens[3].equals("CPF")) {
                    Contato contato = new PessoaFisica(
                            tokens[0], // nome
                            tokens[1], // email
                            tokens[2], // telefone
                            tokens[4]  // CPF
                    );
                    contatos.add(contato);
                } else if (tokens[3].equals("CNPJ")) {
                    Contato contato = new PessoaJuridica(
                            tokens[0], // nome
                            tokens[1], // email
                            tokens[2], // telefone
                            tokens[4]  // CNPJ
                    );
                    contatos.add(contato);
                } else {
                    // Caso a linha não possua nem CPF e nem CNPJ, lança uma exceção customizada
                    throw new IOException("Documento não é CPF nem CNPJ");
                }
            }
        }
        return contatos;
    }

    private String toCsv(Contato contato) {
        if (contato instanceof PessoaFisica) {
            return toCsv((PessoaFisica) contato);
        } else if (contato instanceof PessoaJuridica) {
            toCsv((PessoaJuridica) contato);
        }

        return contato.getNome()
                + ","
                + contato.getEmail()
                + ","
                + contato.getTelefone()
                + ",N/A,N/A";
    }


    private String toCsv(PessoaFisica contato) {
        return contato.getNome()
                + ","
                + contato.getEmail()
                + ","
                + contato.getTelefone()
                + ",CPF,"
                + contato.getCpf();
    }

    private String toCsv(PessoaJuridica contato) {
        return contato.getNome()
                + ","
                + contato.getEmail()
                + ","
                + contato.getTelefone()
                + ",CNPJ,"
                + contato.getCnpj();
    }


}
