//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // - Vai Importar a classe Scanner para ler entradas do usuário


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // - Scanner vai ser usado para ler números e outras entradas do jogo (nome)

        Placar placar = new Placar(); // - Cria um novo Objeto (Placar)

        boolean continuarJogando = true; // - É o que vai controlar o Jogo em relação a continuar rodando

        while (continuarJogando) { // - É o loop principal
            System.out.print("Digite o nome: "); // - Pede para o usuário digitar um nome
            String nome = scanner.nextLine(); // - Armazena o que foi digitado na variável nome
            Jogador jogador = new Jogador(nome); // - Criará o jogador com o nome que foi digitado

            Jogo jogo = new Jogo(jogador); // - Inicia o jogo
            System.out.println("Olá " + jogador.getNome() + "!");

            boolean acertou = false; // - Vai indicar se o jogador já acertou
            while (!acertou) { // - Vai continuar rodando até o jogador acertar
                System.out.println("Digite um número entre 1 e 100: ");

                if (jogo.jogar(scanner.nextInt())) { // - Verifica se o jogador acertou o número
                    System.out.println("Tentativas: " + jogador.getTentativas()); // - Imprime no final as tentativas feitas pelo player
                    System.out.println("Pontuação: " + jogador.getPontuacao()); // - Imprime a pontuação final do player
                    placar.adicionarJogador(jogador); // - Adiciona o jogador no Placar
                    placar.mostrarRanking();
                    scanner.nextLine();
                    acertou = true; // - Indica que o Jogador acertou
                }
            }

            System.out.print("Deseja jogar novamente? (S/N) - Digitar em letra maiúscula: ");
            String resposta = scanner.nextLine(); // - Vai ler a resposta do Jogador
            if (!resposta.equalsIgnoreCase("S")) { // - Se a resposta não for S, o jogo irá parar totalmente
                continuarJogando = false;
            }
        }

        scanner.close(); // - Fecha o Scanner
    }
}
