import java.util.*;
import java.util.Random;

public class Computador {


    private Random rand = new Random();
    private Set<Integer> sorteado = new HashSet<>();
    private int pontuacao = 0;

    public Computador() {

    }

    public void preencheSort(){

        for(int i = 0 ; i <= 6; i++){


            int rnd = rand.nextInt(60)+1;
            sorteado.add(rnd);

        }

    }

    public Set<Integer> getSorteado() {
        return sorteado;
    }

    public int calculaPontuacao(Jogador aposta){

        for(Integer i : aposta.getAposta()){

            for(Integer j : this.sorteado){

                if(i == j){
                    pontuacao++;
                }

            }

        }

        return pontuacao;

    }

    @Override
    public String toString() {
        return "Números " +
                "sorteados=" + sorteado;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computador sort = (Computador) o;
        return Objects.equals(getSorteado(), sort.getSorteado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSorteado());
    }
}
