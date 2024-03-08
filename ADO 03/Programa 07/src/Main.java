import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite  a sua altura: ");
        double Altura = input.nextDouble();

        System.out.println("Digite o seu peso:");
        double Peso = input.nextDouble();

        double IMC = CalcularImc(Altura, Peso);
        boolean CondicaoImc = VerificarImc(IMC);

        System.out.println("Seu Imc é de "+IMC);
        System.out.println("Esta acima do peso? "+CondicaoImc);
    }

    public static boolean VerificarImc(double IMC) {
        boolean CondicaoImc = IMC > 24.9;
        return CondicaoImc;
    }
    public static double CalcularImc(double Altura , double Peso) {

        double IMC =  Peso/(Altura*Altura);
        return IMC;
    }

}