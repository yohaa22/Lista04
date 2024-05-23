import java.util.ArrayList;

public class Programa {
    private ArrayList<Livro> livros;

    public Programa() {

        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void mostrarLivros() {
        for (Livro livro : livros) {
            livro.mostrarDados();
        }
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro(
            "1598FHK",
            "Core Java 2",
            "Cay S. Horstmann e Gary Cornell",
            "0130819336",
            2005
        );

        Livro livro2 = new Livro(
            "9865PLO",
            "Java, Como programar",
            "Harvey Deitel",
            "0130341517",
            2015
        );


        Programa programa = new Programa();
        programa.adicionarLivro(livro1);
        programa.adicionarLivro(livro2);


        programa.mostrarLivros();
    }
}
