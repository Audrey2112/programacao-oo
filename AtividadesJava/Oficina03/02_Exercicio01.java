public class Exercicio01 {

    public static void main(String[] args) {
        // Criando objetos
        Livro deitel = new Livro("Java: Como Programar", "Deitel & Deitel", 800);

        System.out.println("Primeiro livro");
        deitel.abrir();
        deitel.irParaPagina(200);
        deitel.virarPagina();
        deitel.virarPagina();
        deitel.fechar();
        deitel.virarPagina(); // Erro!

        System.out.println("Segundo livro");
        Livro happyPoppers = new Livro("Happy Poppers", "Homer Simpson", 345);

        happyPoppers.fechar(); // Erro!
        happyPoppers.abrir();
        happyPoppers.irParaPagina(500); // Erro
        happyPoppers.irParaPagina(-99); // Erro
        happyPoppers.irParaPagina(100);
        happyPoppers.voltarPagina();
        happyPoppers.voltarPagina();
        happyPoppers.voltarPagina();
        happyPoppers.fechar();

    }
}
