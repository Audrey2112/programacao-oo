import java.util.ArrayList;

/*
- Classe Placar - Responsável por armazenar e exibir a pontuação dos jogadores
    - Atributos:
        - private ArrayList<Jogador> ranking

    - Métodos obrigatórios:
        - Construtor sem parâmetros que inicializa o ranking.
        - void adicionarJogador(Jogador j): adiciona jogador ao ranking.
        - void mostrarRanking(): imprime nome e pontuação de cada jogador.
*/

// - Criando a classe Placar
    public class Placar {

// - Atributos da classe
    private ArrayList<Jogador> ranking; // - Usada para gerenciar a lista de jogadores no placar.

// - Construtor da classe
    public Placar (){
        this.ranking = new ArrayList<>(); // - Vai iniciar a lista vazia ()
    }

// - Metodo para adicionar jogador no ranking
    public void adicionarJogador(Jogador jogador){
        ranking.add(jogador); // - É o que vai adicionar o jogador a lista
    }

// - Metodo para mostrar Ranking de jogadores
    public void mostrarRanking(){
    System.out.println("RANKING DE JOGADORES");
        for (Jogador jogador : ranking) {
            System.out.println(jogador.getNome() + " " + jogador.getPontuacao() + " Pontos"); // - vai imprimir o nome e pontuação da cada jogador
        }
    }
}