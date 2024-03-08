import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base do retangulo:");
        int Base = input.nextInt();

        System.out.println("Digite a altura do retangulo:");
        int Altura = input.nextInt();

        MostrarTela(Base,Altura);

    }

    public static void MostrarTela(int B, int A) {
        int C = 0;
        int J = 0;

        while(C < A) {
            while(J < B) {
                System.out.printf("* ");
                J++;
            }
            J = 0;
            System.out.println();
            C++;
        }
    }
}