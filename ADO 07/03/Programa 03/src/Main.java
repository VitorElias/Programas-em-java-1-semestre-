import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite por qual numero a sequencia ira começar: ");
        int Inicio = input.nextInt();

        System.out.println("Digite por qual numero a sequencia ira terminar:");
        int Fim = input.nextInt();

        MostrarTela(Inicio,Fim);


    }
    public static void MostrarTela(int I , int F) {

        while(I <= F) {
           System.out.println(I);
           I++;
        }
    }
}