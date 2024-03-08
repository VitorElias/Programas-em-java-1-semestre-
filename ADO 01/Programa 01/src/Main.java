import java.util.Scanner;


class Main {
    public static void main(String[] args ) {
         Scanner input = new Scanner(System.in);

         System.out.println("Digite um numero:");
         int N1 = input.nextInt();

         System.out.println("Digite outro numero:");
         int N2 = input.nextInt();

         int Total = Calcular(N1,N2);

         System.out.println("=====================\n");
         System.out.printf("A soma de %d + %d é %d",N1,N2,Total);





    }

    public static int Calcular(int N1, int N2) {
        int Total2 = N1+N2;

        return Total2;
    }
}