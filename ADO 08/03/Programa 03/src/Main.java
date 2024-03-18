import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = input.nextInt();

        int Total = CalcularPar(N);

        System.out.println("A soma dos numeros pares até "+N+" é "+Total);

    }

    public static int CalcularPar(int N) {
        int Total = 0;

        for(int C = 0; C < N ; C++) {

            if(C%2 == 0) {
                Total += C;
            }else {
                continue;
            }
        }
        return Total;
    }
}