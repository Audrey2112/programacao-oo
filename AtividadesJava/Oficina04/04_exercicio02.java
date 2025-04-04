public class Exercicio02 {
    public static void main(String[] args) {
        Livro l1 = new Livro(); // Construtor padrão
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899); //Construtor com valores específicos
 
        l1.exibir();
        l2.exibir();
    }
} 
