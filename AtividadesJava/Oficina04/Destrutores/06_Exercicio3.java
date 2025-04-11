public class Exercicio3 {
    public static void main(String[] args) {
        {
            Recurso r = new Recurso();
        }

        System.gc(); // Objeto saiu do escopo e está elegível ao GC
        System.out.println("Aguardando coleta...");
    }
}
