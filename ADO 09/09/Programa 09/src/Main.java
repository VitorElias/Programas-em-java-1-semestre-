import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase : ");
        String Frase = new String(input.nextLine());

        String[] Palavras = CriarArray(Frase);

        MostrarTela(Palavras);



    }

    public static String[] CriarArray(String Frase) {

        String[] Palavras = Frase.split(" ");
        return Palavras;
    }

    public static void MostrarTela(String[] Palavras) {

        System.out.println(" A frase contem "+(Palavras.length)+" palavras que são: \n");

        for(int C = 0 ; C < Palavras.length ; C++) {

            System.out.println(Palavras[C]);
        }
    }
}