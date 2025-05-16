import java.util.Random;
/*
 - Subclasse Arqueiro:
 - ataque médio com chance de ataque crítico,
 - habilidade especial: "Chuva de Flechas" (3 ataques)
 */


// -  Criando a subclasse Arqueiro
public class Arqueiro extends Personagem {

        private Random rand = new Random();  // Está sendo usado para determinar a chance de um ataque crítico no inimigo

// - Construtor da subclasse usando o super()
        public Arqueiro(String nome) { 
            super(nome, 100, 20); // super - Chamada para o construtor default da classe pai (Personagem)
        }

        @Override
        public void atacar(Personagem inimigo) {  // Verifica se é um ataque crítico (possui 25% de chance)
            boolean critico = rand.nextInt(100) < 25; // aqui é definido esses 25% de chance
            int dano = critico ? ataqueBase * 2 : ataqueBase; // Caso seja um ataque crítico, o dano causado ao inimigo é dobrado
            System.out.println(nome + (critico ? " acerta um CRÍTICO em " : " atira em ") + inimigo.nome + " causando " + dano + " de dano!");
            inimigo.defender(dano); // Vai aplicar o dano cometido no inimigo
        }

        @Override
        public void defender(int dano) {
            hp -= dano; // Usado para subtrair o dano da vida 
            System.out.println(nome + " levou " + dano + " de dano. Precisa de cobertura!");
        }

        @Override
        public void usarHabilidadeEspecial() { 
            System.out.println(nome + " Usa sua habilidade especial com três ataques consecutivos: CHUVA DE FLECHAS!!!!!!");
           // Sem inimigo definido, mas ainda sim é simulado a habilidade especial
        }
}
