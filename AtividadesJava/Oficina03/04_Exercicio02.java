public class Exercicio02 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Batman", "1234/00");

        conta1.consultarSaldo();

        System.out.println("\n > Depositando 2000");
        conta1.depositar(2000);
        conta1.consultarSaldo();

        System.out.println("\n > Sacar 500");
        conta1.sacar(500);
        conta1.consultarSaldo();

        System.out.println("\n > Sacar 600");
        if (!conta1.sacar(600)) {
            System.err.println("Erro ao sacar");
        }
        conta1.consultarSaldo();

    }
}
