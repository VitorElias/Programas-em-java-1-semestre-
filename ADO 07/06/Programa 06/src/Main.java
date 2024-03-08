import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int N = input.nextInt();

        MostrarTela(N);

    }
    public static void MostrarTela(int N) {
        int C = 0;

        while(N > C) {
            System.out.printf("* ");
            C++;
        }
    }
}