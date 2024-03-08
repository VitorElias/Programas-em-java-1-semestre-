import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do quadrado:");
        int T = input.nextInt();

        MontarQuadrado(T);


    }
    public static void MontarQuadrado(int T) {
        int C = 0;
        int J = 0;

        while(J < T) {
          while (C < T) {
              System.out.printf("* ");
              C++;
          }
          C = 0;
          J++;
          System.out.println();
      }
    }
}