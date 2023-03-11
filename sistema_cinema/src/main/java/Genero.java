
public class Genero {

    private String nomeGenero;

    public Genero(){}

    public Genero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "nomeGenero='" + nomeGenero + '\'' +
                '}';
    }
}
