import java.util.Random;

/*
- Classe Jogo - Gerencia a lógica da rodada de adivinhação
    - Atributos:
        - private Jogador jogador
        - private int numeroSecreto

    - Métodos obrigatórios:
        - Construtor que recebe um jogador e sorteia um número aleatório entre 1 e 100.
        - String jogar(int tentativa):
        - Incrementa as tentativas.
        - Informa se o número é "maior", "menor" ou "acertou".
        - Atualiza a pontuação se acertar.
*/

// - Criando a classe Jogo
public class Jogo {

// - Atributos da classe
    private Jogador jogador;
    private int numeroSecreto;  // - define o número secreto a ser descoberto

// - Construtor da classe
    public Jogo(Jogador jogador){
        this.jogador = jogador;     // - Atribui o jogador a classe
        Random rand = new Random(); // - É o que vai gerar números aleatórios
        this.numeroSecreto = rand.nextInt(100) + 1; // - É responsavel por sortear um numero entre 1 a 100
    }

// - Metodo jogar da classe
    public boolean jogar(int tentativas) {
        jogador.adicionarTentativas();

        if (tentativas < numeroSecreto) { // - Busca mostrar ao jogador o quão perto ou longe ele está do numero sorteado
            System.out.println("O número sorteado é maior, tente novamente!");
            return false; // - Indica que o jogador ainda não acertou
        } else if (tentativas > numeroSecreto) {
            System.out.println("O número sorteado é menor, tente novamente!");
            return false; // - Indica que o jogador ainda não acertou
        } else {
            int pontuacao = 100 - jogador.getTentativas() * 10; // - Cálculo da pontuação de forma proporcional ao número de tentativas
            jogador.atualizarPontuacao(pontuacao); // - Vai atualizar a pontuação do jogador
            jogador.atualizarPontuacao(Math.max(pontuacao, 0)); // - Faz com que a pontuação não seja negativa
            System.out.println("Você acertou!"); // - Imprime a mensagem que o jogador acertou
            return true; // - Jogador acertou o número
        }
    }
}
