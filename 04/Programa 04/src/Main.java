import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite por qual numero ira começar a sequência: ");
        int Inicio = input.nextInt();

        System.out.println("digite por qual numero ira terminar a sequência: ");
        int Fim = input.nextInt();

        MostrarTela(Inicio,Fim);

    }
    public static void MostrarTela(int I, int F) {

        while(I >= F) {
            System.out.println(I);
            I--;
        }

    }
}