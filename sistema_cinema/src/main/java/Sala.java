public class Sala {
    private Integer numeroSala;

    public Sala(){}

    public Sala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroSala=" + numeroSala +
                '}';
    }
}
