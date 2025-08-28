public class Pessoa {

    //Attributes

    private int id;
    private String nome;
    private int idade;

    //Constructor

    public Pessoa (int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    //Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //ToString

    @Override
    public String toString() {
        return "Id = " + id + ", nome = " + nome + "', idade = " + idade + "\n";
    }


    }

