import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos açais pequenos?");
        int P = input.nextInt();

        System.out.println("Quantos açais medios?");
        int M = input.nextInt();

        System.out.println("Quantos açais Grandes?");
        int G = input.nextInt();

        System.out.println("porcentagem em desconto?");
        int Por = input.nextInt();

        double Total = CalcularAcais(P,M,G,Por);

        System.out.println("O total a se pagar é "+Total);

    }

    public static double CalcularAcais(int P ,int M , int G , int Por) {

        double Total = (P*13.50)+(M*15.00)+(G*17.50);

            Total = porcentagem(Total, Por);
        return Total;

    }
    public static double porcentagem(double Total,int Por) {

        Total = Total-((Total*Por)/100);
        return Total;
    }
}