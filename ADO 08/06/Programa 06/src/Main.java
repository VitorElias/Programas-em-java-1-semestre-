import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int Numero = input.nextInt();

        System.out.println("Digite o expoente: ");
        int Expoente = input.nextInt();

        if(Numero < 0 || Expoente < 0) {
         System.out.println("CALCULO INVALIDO");

        }else {
            int Potenciacao = CalcularExpoente(Numero, Expoente);

            System.out.println("O resultado é " + Potenciacao);
        }

    }
    public static int CalcularExpoente(int N , int P) {

        if(P == 0) {
            return 1;
        }else {

            int Total = N;

            for (int C = 1; C < P; C++) {
                Total *= N;
            }
            return Total;
        }
    }
}