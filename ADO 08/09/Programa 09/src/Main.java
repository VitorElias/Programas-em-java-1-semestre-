import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String Frase = input.nextLine();

        String Invertida = Inverter(Frase);

        System.out.println(Invertida);


    }
    public static String Inverter(String Frase) {

        String F = "";

        for(int C = Frase.length()-1 ; C >= 0 ; C--) {

            F += Frase.charAt(C);
        }

        return F;
    }
}