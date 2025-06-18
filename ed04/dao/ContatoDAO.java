package ed04.dao;

import ed04.entidade.Contato;

import java.sql.SQLException;
import java.util.List;

public interface ContatoDAO {

    /**
     * Recupera todos os contatos.
     *
     * @return Lista de contatos.
     * @throws Exception se ocorrer um erro durante a recuperação.
     */
    List<Contato> getContatos() throws Exception;

    /**
     * Insere um novo contato.
     *
     * @param contato O contato a ser inserido.
     * @throws Exception se ocorrer um erro durante a inserção.
     */
    void inserir(Contato contato) throws Exception;

    /**
     * Deleta um contato.
     *
     * @param contato O contato a ser deletado.
     * @throws Exception se ocorrer um erro durante a exclusão.
     */
    void deletar(Contato contato) throws Exception;

    /**
     * Atualiza um contato existente.
     *
     * @param contato O contato a ser atualizado.
     * @throws Exception se ocorrer um erro durante a atualização.
     */
    void atualizar(Contato contato) throws Exception;
}
