import java.util.Scanner;

class main {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor em kilos a ser convertido:");
        double Kg = input.nextDouble();

        double Gramas = Converter(Kg);

        System.out.printf("O Valor convertido ficou em %.2f",Gramas);

    }
    public static double Converter(double Kg) {

        double gramas = Kg*1000;
        return gramas;
    }
}