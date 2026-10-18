package filmnow;
import java.util.Objects;

public class Filme {

    private String nome;

    private int ano;

    private String local;

    private boolean hot;

    public Filme(String nome, int ano, String local) {
        this.nome = nome;
        this.ano = ano;
        this.local = local;

    }

    public void setHot(boolean estado) {
        this.hot = estado;
    }

    public boolean getHot() {
        return this.hot;

    }

    public int getAno() {
        return this.ano;

    }

    public String getNome() {
        return this.nome;
    }


    public String toString(){
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Filme)) {
            return false;
        }
        Filme outro = (Filme) o;
        return this.nome.equals(outro.nome) && this.ano == outro.ano;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.ano);
    }
}