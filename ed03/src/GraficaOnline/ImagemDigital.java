package GraficaOnline;

/*
Etapa 3- Implementar a classe ImagemDigital com os atributos:
    - nomeArquivo (tipo String)
    - resolucao (tipo String)
    - O método imprimir() deve exibir o nome do arquivo e sua resolução (ex: “1920x1080”).
*/

// - Criando a classe ImagemDigital
public class ImagemDigital implements Imprimivel { // - implementa a interface chamada Imprimivel


    // - Atributos da classe
    private String nomeArquivo; // - Com o uso de interfaces, não há herança de atributos
    private String resolucao; // - por isso private é usado


    // - Construtor da classe
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    // - Método imprimir - Implementação interface Imprimivel
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo); // - Exibe o nome do arquivo
        System.out.println("Resolução: " + resolucao); // - Exibe a "resolução" da imagem
        System.out.println();
    }
}

