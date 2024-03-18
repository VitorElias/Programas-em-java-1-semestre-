import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da sequência: ");
        int N = input.nextInt();

        int[] Numeros = CriarArray(N, input);

        String Ordem = VerificarOrdem(Numeros);

        System.out.println("Os numeros estão  "+Ordem);


    }

    public static int[] CriarArray(int N , Scanner input) {

        int[] Numeros = new int[N];

        for (int C = 0; C < Numeros.length; C++) {

            System.out.println("Digite um numero");
            Numeros[C] = input.nextInt();
        }
        return Numeros;
    }

    public static String VerificarOrdem(int[] Numeros) {

        boolean Maior = true;
        boolean Menor = true;

        for(int C = 1 ; C < Numeros.length ; C++) {

            if(Numeros[C-1] < Numeros[C]) {
                Menor = false;
            }else if(Numeros[C-1] > Numeros[C]) {
                Maior = false;
            }
        }

        if(Maior) {
            return "Crescente";
        }else if(Menor) {
            return "Decrescente";
        }else {
            return "Desordenados";
        }

    }
}