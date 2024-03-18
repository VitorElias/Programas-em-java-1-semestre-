import java.util.Scanner;


class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Qual o tamanho da sequência? ");
         int N = input.nextInt();

         int[] Numeros = CriarArray(N,input);
         Numeros = InverterArray(Numeros);

         MostrarTela(Numeros);
    }
    public static int[] CriarArray(int N , Scanner input) {

        int[] Numeros = new int[N];

        for(int C = 0; C < Numeros.length ; C++) {

            System.out.println("Digite um numero: ");
            Numeros[C] = input.nextInt();
        }
        return Numeros;
    }

    public static int[] InverterArray(int[] Numeros) {

        int k = Numeros.length-1;
        int Troca = 0;

        for(int C = 0 ; C < Numeros.length/2 ; C++) {

            Troca = Numeros[C];
            Numeros[C] = Numeros[k];
            Numeros[k] = Troca;
            k--;

        }
        return Numeros;
    }

    public static void MostrarTela(int[] Numeros) {

        for(int C = 0 ; C < Numeros.length ; C++) {

            if(C == Numeros.length-1) {
                System.out.print(Numeros[C]);
            }else {
                System.out.print(Numeros[C]+"-");
            }
        }
    }
}