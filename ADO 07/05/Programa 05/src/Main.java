import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int N = input.nextInt();

        MostrarTela(N);


    }
    public static void MostrarTela(int N) {
        int C = 0;

        while(C <= N) {

            if(C%2 == 0) {
                System.out.println(C);
            }
            C++;
        }
    }
}