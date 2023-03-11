
public class Sessao {
    private int filme;
    private int sala;

    public Sessao(){}

    public Sessao(int filme, Sala sala) {
        this.filme = filme;
        this.sala = sala.getNumeroSala();
    }

    public int getFilme() {
        return filme;
    }

    public void setFilme(int filme) {
        this.filme = filme;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filme=" + filme +
                ", sala=" + sala +
                '}';
    }
}
