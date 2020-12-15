import java.util.Objects;

public class Palavra {

    private String palavra;
    private int tamanho;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.tamanho = alocaTamanho(palavra);
    }

    @Override
    public String toString() {
        return "\n"+palavra ;

    }

    public int compareTo(Palavra palavra){

        return this.tamanho - palavra.getTamanho();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palavra palavra1 = (Palavra) o;
        return getTamanho() == palavra1.getTamanho() &&
                Objects.equals(getPalavra(), palavra1.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra(), getTamanho());
    }

    public String getPalavra() {
        return palavra;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int alocaTamanho(String palavra){

        int tamanho= 0;

        for(char i : palavra.toCharArray()){
           tamanho++;
        }

        return tamanho;

    }
}
