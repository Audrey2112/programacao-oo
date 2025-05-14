/*
 - Subclasse Mago:
 - ataque mágico, defesa fraca,
 - habilidade especial: "Bola de Fogo" (ataque em área).
 */


// -  Criando a subclasse Mago
public class Mago extends Personagem {


    // - Construtor da subclasse usando o super()
    public Mago(String nome) {
        super(nome, 90, 40);
    }


    // - Sobrescrita de métodos - @Override
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + "Realiza um ataque mágico em " + inimigo.nome + "!!!!!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano; // - sua defesa é fraca
        System.out.println(nome + " Sua defesa não foi boa, acabou levando " + dano + " pontos de dano");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " Acaba Usando sua Habilidade especial: BOLA DE FOGOOO!!!!!");
    }

}