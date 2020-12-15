import java.util.Scanner;

public class MainMega {

    public static void main(String[] args) {

        Computador sort = new Computador();
        sort.preencheSort();

        Jogador jogador = new Jogador();
        Scanner scan = new Scanner(System.in);;

        System.out.println("\n-------MEGA SENA---------\n\n");

        for(int i = 0 ; i < 6;){

            System.out.printf("Escolha seu %d° número: ",i+1);
            int num = scan.nextInt();

            if(num > 0 && num <= 60 && jogador.preencheAposta(num)){
                jogador.preencheAposta(num);
                i++;
            }

            else System.out.printf("\nNumero inválido!! Permitado numeros de 1 a 60 apenas e sem repetições!!\n\n");

        }

        System.out.println();
        System.out.println(jogador);
        System.out.println(sort);

        switch (sort.calculaPontuacao(jogador)){

            case 4:
                System.out.println("#### Fez uma Quadra ####");
                break;

            case 5:
                System.out.println("##### Fez uma Quina #####");
                break;

            case 6:
                System.out.println("###### Fez uma Cena ######");
                break;


            default:
                System.out.println("Não foi dessa vez ;T__T; ");
                break;
        }



    }

}
