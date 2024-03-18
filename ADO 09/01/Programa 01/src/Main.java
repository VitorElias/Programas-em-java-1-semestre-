import java.util.HexFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        int[] Numeros = NumerosInteiros(input);

        MostrarTela(Numeros);
    }
    public static int[] NumerosInteiros(Scanner input) {
        int[] Numeros = new int[5];

        for(int C = 0; C < 5 ; C++) {
            System.out.println((C+1)+"-- Digite um numero: ");
            Numeros[C] = input.nextInt();
        }
        return Numeros;
    }

    public static void MostrarTela(int[] Numeros) {

        System.out.println("NUMEROS DIGITADOS");
        System.out.println("======================================");
        for(int C = 0 ; C < Numeros.length; C++) {

            if(C == Numeros.length-1) {
                System.out.print(Numeros[C]);
            }else {
                System.out.print(Numeros[C]+"-");
            }
        }
    }
}