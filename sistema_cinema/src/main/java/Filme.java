
public class Filme {
    private String nome;
    private int genero;

    public Filme(){

    }

    public Filme(String nome, int genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGenero(String id) {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero +
                '}';
    }
}
