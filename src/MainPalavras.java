import java.util.*;

public class MainPalavras {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> sublist = new ArrayList<>();
        Map<Integer, ArrayList> mapa = new HashMap<>();
        Map<HashMap, String> subMapa = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        Palavra palavra;
        String str;

        int i = 0;
        do {
            System.out.printf("\nPalavra a ser adicionada: ");

            str = scan.nextLine();

            if (!str.equals("sair")) {

                palavra = new Palavra(str);

               // mapa.put(palavra.getTamanho(), lista);
               // subMapa.put((HashMap) mapa,  );
                lista.add(palavra.getPalavra());


            }

        } while (!str.equals("sair"));

        Collections.sort(lista);

        System.out.println();
        System.out.println("Palvras Cadastradas em ordem alfábetica: "+lista);

    }
}
