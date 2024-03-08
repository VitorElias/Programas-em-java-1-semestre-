import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int N1 = input.nextInt();

        int Total = Calcular(N1);

        System.out.println("========================\n");
        System.out.printf("o dobro de %d é %d",N1,Total);
    }

    public static int Calcular(int N1) {
        int Total1 = N1*2;
        return Total1;
    }
}