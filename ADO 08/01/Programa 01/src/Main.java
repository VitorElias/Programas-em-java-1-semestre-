import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero na sequencia ");
        int N = input.nextInt();

        int Total = Soma(N);

        System.out.println("A soma dos numeros de 1 até "+N+" é "+Total);

    }
    public static int Soma(int N ) {
       int Total = 0;

        for(int C = 1; C <= N ; C++) {
            Total += C;
        }
        return Total;
    }

}