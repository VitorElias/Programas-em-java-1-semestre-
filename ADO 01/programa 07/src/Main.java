import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos açai ira comprar?");
        int Quant = input.nextInt();

        double Total = CalcularAcais(Quant);

        System.out.println("O total a se pagar é de "+Total);


    }
    public static double CalcularAcais(int Quant) {
        double Total = Quant*13.50;
        return Total;
    }
}