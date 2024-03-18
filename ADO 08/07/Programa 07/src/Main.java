import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String Frase = new String(input.nextLine());

        String F = Separar(Frase);

        System.out.println(F);


    }

    public static String Separar(String Frase ) {
        String F = "";

        for(int C = 0; C < Frase.length(); C++) {

            F += Frase.charAt(C)+"-";
        }
       return F;
    }
}