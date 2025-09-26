public class Livro {

    protected int isbn;
    protected String titulo;
    protected String autor;
    protected String status;
    boolean disponibilidade;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if (disponibilidade == true) {
            status = "disponivel";
        } else {
            status = "emprestado";
        }
    }

    public void emprestar() {
        disponibilidade = false;
    }

    public void devolver() {
        disponibilidade = false;
    }
}


