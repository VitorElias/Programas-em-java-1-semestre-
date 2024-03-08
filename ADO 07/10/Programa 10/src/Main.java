import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String Frase = new String(input.nextLine());

        MostrarTela(Frase);
    }

    public static void MostrarTela(String Frase) {

        for(int C = 0; C < Frase.length() ; C++) {

            System.out.println(Frase.charAt(C));

        }
    }
}