package GraficaOnline;

/*
Etapa 5 - Criar a classe ProgramaImpressao com método main:
    - Instanciar objetos das quatro classes implementadoras de Imprimivel.
    - Chamar o método imprimir() diretamente em cada instância (sem uso de polimorfismo via Imprimivel).
*/

// - Criando a classe ProgramaImpressao - Método main
public class ProgramaImpressao {
    public static void main(String[] args) {

        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento."); // - Cria um objeto de DocumentoTexto
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");  // - Cria um objeto de ImagemDigital
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de Vendas", "barra"); // - Cria um objeto de GraficoEstatistico
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12); // - Cria um objeto de RelatorioPDF

        // - Chamada dos métodos imprimir diretamente
        doc.imprimir();
        img.imprimir();
        grafico.imprimir();
        relatorio.imprimir();
    }
}