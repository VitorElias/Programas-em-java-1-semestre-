import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do triângulo: ");
        int N1 = input.nextInt();

       Triangulos(N1);

    }

    public static void Triangulos(int N1 ) {
         int C = 1;
         int J = 0;

        while(C <= N1){
         while(J < C) {
             System.out.printf("* ");
             J++;
         }
            J = 0;
            System.out.println();
            C++;
        }
    }
}