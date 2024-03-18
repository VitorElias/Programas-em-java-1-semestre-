import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] Nomes = PedirNomes(input);

        MostrarTela(Nomes);

    }

    public static String[] PedirNomes(Scanner input) {

        String[] Nomes = new String[5];

        for(int C = 0; C < Nomes.length ; C++) {

            System.out.println((C+1)+" -- Digite um nome:");
            Nomes[C] = input.nextLine();

        }

        return Nomes;
    }

    public static void MostrarTela(String[] Nomes) {

        System.out.println("==========================");
        System.out.println("Nomes Digitados");

        for(int C = 0 ; C < Nomes.length ; C++) {

            System.out.println((C+1)+" -- Nome Digitado : "+Nomes[C]);
        }
    }
}