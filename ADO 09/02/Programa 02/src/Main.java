import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] Numeros = PedirNumeros(input);

        MostrarTela(Numeros);

    }

    public static double[] PedirNumeros(Scanner input) {

        double[] Numeros = new double[5];

        for(int C = 0 ; C < Numeros.length ; C++) {

            System.out.println((C+1)+"-- Digite um numero :");
            Numeros[C] = input.nextInt();
        }
        return Numeros;
    }

    public static void MostrarTela(double[] Numeros ) {

        System.out.println("============================");
        System.out.println("NUMEROS DIGITADOS");

        for(int C = 0; C < Numeros.length ; C++) {

            System.out.println((C+1)+"-- Numero digitado "+Numeros[C]);
        }
    }
}