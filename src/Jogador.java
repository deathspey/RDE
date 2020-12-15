import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Jogador {

    private Set <Integer> aposta = new HashSet<>();

    @Override
    public String toString() {
        return "Sua" +
                " aposta=" + aposta;

    }

    public Set<Integer> getAposta() {
        return aposta;
    }

    public boolean preencheAposta(int num){

        if(aposta.add(num)) {
            aposta.add(num);
            return true;
        }
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return Objects.equals(aposta, jogador.aposta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aposta);
    }
}
