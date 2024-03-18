import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rand = new Random();

        System.out.println("Digite um numero para criar a sequencia aleatorio entre 0 e 10:");
        int N = input.nextInt();

        int[] Numeros = CriarArray(N, Rand);

        System.out.println("Digite um numero a ser verificado na sequência: ");
        int N1 = input.nextInt();

        int Buscar = VerificarNumero(N1,Numeros);

        if(Buscar == -1) {
            System.out.println("O numero digitado não foi encontrado!");
        }else {
            System.out.println("O numero digitado foi encontrado na posição "+Buscar);
        }

        MostrarTela(Numeros);



    }

    public static int[] CriarArray(int N, Random Rand) {

        int[] Numeros = new int[N];

        for(int C = 0; C < Numeros.length ; C++) {

            Numeros[C] = Rand.nextInt(1,10);
        }
        return Numeros;
    }

    public static int VerificarNumero(int N1 , int[] Numeros) {

        int Buscar = -1;

        for(int C = 0 ; C < Numeros.length ; C++) {

            if(N1 == Numeros[C]) {

                Buscar = C+1;
                break;
            }
        }

        return Buscar;
    }

    public static void MostrarTela(int[] Numeros) {

        System.out.println("NUMEROS CRIADOS");

        for(int C = 0; C < Numeros.length ; C++) {

            if(C == Numeros.length-1 ) {
                System.out.print(Numeros[C]);
            }else {
                System.out.print(Numeros[C]+"-");
            }
        }
    }
}