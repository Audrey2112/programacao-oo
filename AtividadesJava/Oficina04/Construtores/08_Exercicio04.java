public class Exercicio04 {
    public static void main(String[] args) {
        Conta c1 = new Conta("001", 500);
        Conta c2 = new Conta("002", -100); // saldo deve ser 0

        c1.exibir();
        c2.exibir();
    }
}
