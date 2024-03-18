import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Digite um numero pra fazer a tabuada: ");
       int N = input.nextInt();

       int[] Tabuada = CriarTabuada(N);

       MostrarTela(Tabuada,N);


    }

    public static int[] CriarTabuada(int N ) {

        int[] Tabuada = new int[10];

        for(int C = 0; C < Tabuada.length ; C++) {

            Tabuada[C] = (C+1)*N;
        }
        return Tabuada;
    }

    public static void MostrarTela(int[] Tabuada, int N) {

        for(int C = 0 ; C < Tabuada.length ; C++) {

            System.out.println(N+" X "+(C+1)+" = "+Tabuada[C]);
        }
    }
}