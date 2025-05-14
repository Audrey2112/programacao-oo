/*
- Jogo de RPG
- Implementar uma hierarquia de classes representando personagens de um jogo de RPG.
- Todos os personagens possuem um nome, pontos de vida (HP) e pontos de ataque base.
- Cada subclasse implementa um comportamento específico para atacar e defender.
- Além disso, crie um metodo usarHabilidadeEspecial() com efeitos distintos por classe.
*/


// - Criando a classe Personagem (Superclasse)
public abstract class Personagem { // - serve apenas como uma base para as subclasses (por isso é declarada como abstrata)


// - Atributos da classe Personagem - protected (protegido)
    protected String nome;
    protected int hp;
    protected int ataqueBase;


// Construtor da classe
    public Personagem (String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }


// - Criando os métodos da classe que serão implementados nas subclasses

    public abstract void atacar(Personagem inimigo); // - mostra como é o ataque do personagem
                                                // - vai ser diferente para cada subclasse

    public abstract void defender(int dano); // - mostra como é a defesa do personagem
                                        // - vai ser diferente para cada subclasse também

    public abstract void usarHabilidadeEspecial(); // - mostra o uso das habilidades especiais


    public void status(){ // - vai exibir o status atual do personagem (suas informações)
        System.out.println("-----------------------------------------");
        System.out.println("Personagem: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("ATQ: " + ataqueBase);
    }

    public boolean estaVivo() { // - verifica se o personagem está vivo (hp maior do que 0)
        return hp > 0;
    }
}