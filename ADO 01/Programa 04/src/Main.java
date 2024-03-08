import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int N = input.nextInt();

        int Total = Metade(N);

        System.out.println("===================\n");
        System.out.printf("A metade de %d é %d",N,Total);

    }
    public static int Metade(int N) {
        int T = N/2;
        return T;
    }
}