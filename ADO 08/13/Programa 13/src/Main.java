import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero da sequência de fibonnaci: ");
        int F = input.nextInt();

        int Fib = Verificar(F);

        System.out.println("A posição "+F+" se resulta no numero "+Fib);


    }

    public static int Verificar(int F) {

        int Um = 1, Dois = 0, Soma = 0;

        for(int C = 0 ; C < F ; C++) {

            Soma = Um+Dois;
            Um = Dois;
            Dois = Soma;
        }
        return Soma;

    }
}