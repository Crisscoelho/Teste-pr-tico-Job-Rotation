import java.util.Scanner;


    public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int distancia = entradaTeclado.nextInt();

        int veloCarro = 110;

        int veloCaminhao = 80;


        double tempoPedagio = 0.1;

        double tempoCarro = ((distancia / veloCarro) + tempoPedagio);

        double tempoCaminhao = ((distancia / veloCaminhao) + tempoPedagio);

        System.out.printf("%d tempo carro\n", tempoCarro);

        System.out.printf("%d tempo caminhao\n", tempoCaminhao);

    }
}
