import java.util.Scanner;

public class Exercicio4 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Escreva uma palavra:  ");
            String original = input.nextLine();

            String rev = "";
            for(int i = original.length() - 1 ; i>=0 ; i--){
                rev += original.charAt(i);
            }
            System.out.println("A palavra inversa: "+rev);
        }
    }
