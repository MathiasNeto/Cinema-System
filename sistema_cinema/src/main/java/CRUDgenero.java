import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CRUDgenero{

    List<Genero> generos = new ArrayList<>();

    public void criar(Genero genero) {
            generos.add(genero);
    }

    public List<Genero> ler() {
        for (Genero g: generos) {
            System.out.println(g);
        }
        return generos;
    }

    public void atualizar(int id,Genero genero) {
        generos.set(id, genero);
    }

    public void excluir(int id) {
        generos.remove(id);
    }

}
