// - Aluna: Audrey Cristhiny T. Kochinski

/*
- Classe Jogador - Representa o participante do jogo
 - Atributos:
    - private String nome
    - private int tentativas
    - private int pontuacao

 - Métodos obrigatórios:
     - Construtor que recebe o nome do jogador.
     - Getters e setters para os três atributos.
     - void incrementarTentativas(): soma 1 à quantidade de tentativas.
     - void atualizarPontuacao(int valor): soma pontos ao jogador.
*/

// - Criando a classe Jogador
public class Jogador {

    // - Atributos da classe Jogador
    private String nome;    // - Nome do jogador
    private int tentativas; // - Numero de tentativas realizadas
    private int pontuacao;  // - Pontuação total do jogador

    // - Construtor da classe Jogador
    public Jogador (String nome){
        this.nome = nome;       // - Inicializa o nome
        this.tentativas = 0;    // - Inicializa o contador de tentativas em 0
        this.pontuacao = 0;     // - Inicializa a pontuação com 0
    }

    // - Getter e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void adicionarTentativas() {
        this.tentativas++; // - Vai aumentar o número de tentatvias dojogador
    }

    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}

