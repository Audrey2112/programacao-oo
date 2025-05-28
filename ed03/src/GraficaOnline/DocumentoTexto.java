package GraficaOnline;

/*
Etapa 2 -Implementar a classe DocumentoTexto com os atributos:
    - titulo (tipo String)
    - conteudo (tipo String)
    - O método imprimir() deve exibir o título em letras maiúsculas, seguido do conteúdo do texto
*/

// - Criando a classe DocumentoTexto
public class DocumentoTexto implements Imprimivel { // - Indica que ela implementa a interface chamada Imprimivel
    // - Ou seja, ela vai implementar os métodos obrigatoriamente definidos lá

    // - Atributos da classe
    private String titulo;    // - Definidos como private pois não há o uso de herança aqui
    private String conteudo; // - só implementa uma interface, que não tem atributos


    // - Construtor da classe - inicializa valores/dados
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    // - Metodo imprimir - da interface Imprimivel
    @Override // - Sobrescrita de métodos - @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase()); // - Exibe o título em letras maiúsculas
        System.out.println(conteudo); // - Conteúdo do texto
        System.out.println(); // - Linha usada para separar os dados
    }
}
