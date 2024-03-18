import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String Frase = new String(input.nextLine());

        String Palindromo = Inverter(Frase);

        boolean Ehpalindromo = VerificarPalindromo(Frase , Palindromo);

        if(Ehpalindromo) {
            System.out.println("É um palindromo!");
        }else {
            System.out.println("Não é um palindromo!");
        }

    }

    public static  String Inverter(String Frase) {

        Frase = Frase.toLowerCase();
        String F = "";

        for(int C = Frase.length()-1 ; C >= 0 ; C--) {

            F += Frase.charAt(C);
        }

        return F;
    }

    public static boolean VerificarPalindromo(String Frase, String Palindromo) {

        if(Frase.equals(Palindromo) || Palindromo.equals(Frase)) {
            return true;
        }else {
            return false;
        }
    }
}