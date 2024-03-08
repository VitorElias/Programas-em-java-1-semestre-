import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos açais pequenos ira comprar?");
        int P = input.nextInt();

        System.out.println("Quantos açais Medios ira comprar?");
        int M = input.nextInt();

        System.out.println("Quantos açais Grande ira comprar?");
        int G = input.nextInt();

        double Total = CalcularAcais(P,M,G);

        System.out.println("O total a se pagar é R$ "+Total);


    }

    public static double CalcularAcais(int P, int M, int G) {

        double Total = (P*13.50)+(M*15.00)+(G*17.50);
        return Total;
    }
}