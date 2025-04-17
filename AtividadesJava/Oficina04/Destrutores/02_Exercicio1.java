public class Exercicio1 {
    public static void main(String[] args) {
        ArquivoTemporario a1 = new ArquivoTemporario("temp1.txt");
        ArquivoTemporario a2 = new ArquivoTemporario("temp2.txt");

        a1.usar();
        a2.usar();

        a1 = null;
        a2 = null;

        System.gc(); // Solicita GC (não garante execução de finalize)
        System.out.println("Final do método main.");
    }
}
