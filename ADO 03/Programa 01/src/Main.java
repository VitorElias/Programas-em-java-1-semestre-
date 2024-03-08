import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua temperatura:");
        double temp = input.nextDouble();

        boolean Febre = VerificarTemperatura(temp);

        System.out.println("Voçê está com febre? "+Febre);


    }

    public static boolean VerificarTemperatura(double Temp) {

        boolean Febre = Temp >= 37.3;
        return Febre;
    }
}