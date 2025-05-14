/*
 - Subclasse Guerreiro:
 - ataque físico forte, reduz dano recebido pela metade na defesa,
 - habilidade especial: "Golpe Duplo" (2x ataque).
 */


// -  Criando a subclasse Guereiro
public class Guerreiro extends Personagem {


// - Construtor da subclasse usando o super()
    public Guerreiro (String nome) {
        super (nome, 130, 35);
    }


// - Sobrescrita de métodos - @Override
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " Ataca ferozmente com sua espada o " + inimigo.nome + "!!!!!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2; // - reduz o dano recebido pela metade
        hp -= danoReduzido;
        System.out.println(nome + "Bela defesa!! Acabou sofrendo apenas: " + danoReduzido + " de dano");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " Habilidade especial: GOLPE DUPLOOOO!!!!!");
    }
}