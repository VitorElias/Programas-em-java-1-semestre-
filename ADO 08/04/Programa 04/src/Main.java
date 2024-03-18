import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite qual numero a sequência começa:");
        int Comeco = input.nextInt();

        System.out.println("Digite qual numero a sequência Termina:");
        int Fim = input.nextInt();

        int Total = CalcularSoma(Comeco,Fim);

        System.out.println("a soma de "+Comeco+" ate "+Fim+" é "+Total);

    }

    public static int CalcularSoma(int C ,  int F) {
        int Total = 0;

        for(int J = C ; J <= F ; J++) {

            if(J%2 == 0) {
                Total += J;
            }
        }
        return Total;
    }
}