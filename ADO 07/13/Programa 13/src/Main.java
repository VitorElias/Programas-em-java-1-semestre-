import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho Do triangulo: ");
        int N1 = input.nextInt();

        Triangulos(N1);

    }
    public static void Triangulos(int N1) {
        int C = 1;
        int J = 0;
        int Espaco = 0;

        while(C <= N1) {

            while(Espaco < N1-C) {
                System.out.print(" ");
                Espaco++;
            }
            Espaco = 0;
            J = 0;

            while(J < C) {

                System.out.print("*");
                J++;
            }
            System.out.println();
            C++;
        }
    }
}