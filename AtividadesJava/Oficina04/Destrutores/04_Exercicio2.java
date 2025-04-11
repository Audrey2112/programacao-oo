public class Exercicio2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) { // Criando muitos objetos sem guardar referência
        }

        System.gc();  // Solicita GC (não garante execução de finalize)
        System.out.println("Objetos criados. Aguardando GC...");
    }
}
