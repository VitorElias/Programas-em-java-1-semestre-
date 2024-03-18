import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero pra ver seu fatorial:");
        int N = input.nextInt();

        int Total = CalcularFatorial(N);

        System.out.println("O fatorial de "+N+" é "+Total);

    }

    public static int CalcularFatorial(int N ) {
        int Total = 1;

        for(int C = N; C >= 1 ; C--) {

            Total *= C;
        }
        return Total;
    }
}