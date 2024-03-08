import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor total da compra:");
        double Compra = input.nextDouble();

        System.out.println("Digite o valor do desconto (Em Reais):");
        double Desconto = input.nextDouble();

        double TotalCompra = Calcular(Compra,Desconto);

        System.out.println("COMPRA REALIZADA!!!!");
        System.out.printf("O valor total é de %.2f",TotalCompra);
    }

    public static double Calcular(double Compra , double Desconto ) {

        double Total = Compra-Desconto;
        return Total;
    }
}