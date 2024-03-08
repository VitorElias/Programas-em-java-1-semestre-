import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero a verificar");
        int N = input.nextInt();

        boolean Par = VerificarPar(N);

        System.out.println("O numero digitado é par? "+Par);

    }
    public static boolean VerificarPar(int N) {
        boolean Par = N%2 == 0;
        return Par;
    }

}