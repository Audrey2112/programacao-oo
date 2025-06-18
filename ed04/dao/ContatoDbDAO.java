package ed04.dao;

import ed04.entidade.Contato;
import ed04.entidade.PessoaFisica;
import ed04.entidade.PessoaJuridica;
import ed04.util.DatabaseManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDbDAO implements ContatoDAO {

    @Override
    public List<Contato> getContatos() throws SQLException {
        List<Contato> contatos = new ArrayList<>();
        String sql = "SELECT * FROM contatos";

        try (Connection conn = DatabaseManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Contato contato;
                String tipo = rs.getString("tipo");

                if ("CPF".equals(tipo)) {
                    contato = new PessoaFisica(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone"),
                            rs.getString("documento")
                    );
                } else {
                    contato = new PessoaJuridica(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email"),
                            rs.getString("telefone"),
                            rs.getString("documento")
                    );
                }

                contatos.add(contato);
            }
        }

        return contatos;
    }

    @Override
    public void inserir(Contato contato) throws SQLException {
        String sql = "INSERT INTO contatos(nome, email, telefone, tipo, documento) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getTelefone());

            if (contato instanceof PessoaFisica) {
                PessoaFisica pessoa = (PessoaFisica) contato;
                stmt.setString(4, "CPF");
                stmt.setString(5, pessoa.getCpf());
            } else if (contato instanceof PessoaJuridica) {
                PessoaJuridica pessoa = (PessoaJuridica) contato;
                stmt.setString(4, "CNPJ");
                stmt.setString(5, pessoa.getCnpj());
            }

            stmt.executeUpdate();
        }
    }

    @Override
    public void deletar(Contato contato) throws SQLException {
        String sql = "DELETE FROM contatos WHERE id = ?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, contato.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void atualizar(Contato contato) throws SQLException {
        String sql = "UPDATE contatos SET nome = ?, email = ?, telefone = ? WHERE id = ?";

        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getTelefone());
            stmt.setInt(4, contato.getId());
            stmt.executeUpdate();
        }
    }
}
