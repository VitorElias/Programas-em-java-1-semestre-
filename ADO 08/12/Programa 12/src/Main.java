import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero primo:");
        int N = input.nextInt();

        Boolean EhPrimo = VerificarPrimos(N);

        if(EhPrimo) {
            System.out.println("É Primo");
        }else {
            System.out.println("Não é Primo");
        }


    }
    public static boolean VerificarPrimos(int N) {
        boolean EhPrimo = true;

        if(N == 0 || N == 1) {
            EhPrimo = false;

        }else if(N == 2) {
            EhPrimo = true;
        }else {


            for (int C = 2; C < N; C++) {

                if (N % C == 0) {
                    EhPrimo = false;
                    break;
                }
            }
        }
        return EhPrimo;
    }
}