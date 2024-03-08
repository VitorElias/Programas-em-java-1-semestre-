import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor total da compra:");
        double Compra = input.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        int por = input.nextInt();

        double ValorFinal = calcularTotal(Compra,por);

        System.out.printf("O valor ja descontado será %.2f",ValorFinal);


    }

    public static double calcularTotal( double Compra, int Por) {

        double Desconto = Desconto(Por,Compra);
        double Total = Compra-Desconto;
        return Total;

    }

    public static double Desconto(int Por , double Compra) {

        double Desconto = (Por*Compra)/100;
        return Desconto;
    }

}