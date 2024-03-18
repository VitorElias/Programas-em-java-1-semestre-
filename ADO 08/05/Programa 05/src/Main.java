import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o inicio da sequência:");
        int Comeco = input.nextInt();

        System.out.println("Digite o fim da sequência:");
        int Fim = input.nextInt();

        System.out.println("Digite o numero a ser somado pelos multiplos: ");
        int N = input.nextInt();

        int Total = CalcularMultiplos(Comeco, Fim, N);

        System.out.println("A soma dos numeros multiplos é "+Total);

    }
    public static int CalcularMultiplos(int C, int F, int N) {
        int Total = 0;

        for(int J = C ; J <= F; J++) {
            if(J%N == 0) {
                Total += J;
            }
        }
        return Total;
    }
}