import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite quantos elementos a sequência vai ter: ");
        int N = input.nextInt();

        int[] Numeros = CriarArray(N , input);

        MostrarTela(Numeros);

    }
    public static int[] CriarArray(int N , Scanner input) {

        int[] Numeros = new int[N];

        for(int C = 0 ; C < Numeros.length ; C++) {

            System.out.println((C+1)+" -- Digite um numero:");
            Numeros[C] = input.nextInt();
        }
        return Numeros;
    }

    public static void MostrarTela(int[] Numeros) {

        System.out.println("NUMEROS DIGITADOS!!!!");
        System.out.println("=============================");

        for(int C = 0 ; C < Numeros.length ; C++) {
            System.out.println((C+1)+"-- Numero Digitado "+Numeros[C]);
        }
    }
}