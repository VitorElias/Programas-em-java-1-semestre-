import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da sequência: ");
        int N = input.nextInt();

        int[] Numeros = CriarArray(N,input);
        int[] NumDobrados = CriarArrayDobrado(Numeros);

        MostrarTela(Numeros, NumDobrados);

    }
    public static int[] CriarArray(int N , Scanner input) {

        int[] Numeros = new int[N];

        for(int C = 0 ; C < Numeros.length ; C++) {

            System.out.println("Digite um numero: ");
            Numeros[C] = input.nextInt();
        }

        return Numeros;
    }

    public static int[] CriarArrayDobrado(int[] Numeros) {

        int[] NumDobrados = new int[Numeros.length];

        for(int C = 0 ; C < NumDobrados.length; C++) {

            NumDobrados[C] = Numeros[C]*2;
        }
        return NumDobrados;
    }

    public static void MostrarTela(int[] Numeros , int[] NumDobrados) {

        System.out.println("=========================");

        System.out.println("\n Numeros Digitados: ");

        for(int C = 0; C < Numeros.length ; C++) {

            if(C == Numeros.length-1) {
                System.out.print(Numeros[C]);
            }else {
                System.out.print(Numeros[C]+"-");
            }
        }

        System.out.println("\nNumeros Dobrados:");

        for(int J = 0 ; J < NumDobrados.length ; J++) {

            if(J == NumDobrados.length-1 ) {
                System.out.print(NumDobrados[J]);
            }else {
                System.out.print(NumDobrados[J]+"-");
            }
        }
    }
}