import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int N1 = input.nextInt();

        int Total = CalcularTriplo(N1);

        System.out.println("===============\n");

        System.out.printf("O triplo de %d é %d", N1,Total);

    }

    public static int CalcularTriplo(int N1) {
        int T = N1*3;
        return T;
    }
}