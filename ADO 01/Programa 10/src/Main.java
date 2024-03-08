import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o seu salario base:");
        double Salario = input.nextDouble();

        System.out.println("Digite o seu bônus salarial:");
        int Bonus = input.nextInt();

        System.out.println("Digite o desconto (EM REAIS):");
        double Desconto = input.nextDouble();

        double Total = CalcularSalario(Salario,Bonus,Desconto);

        System.out.println("seu salario liquido é de  "+Total);





    }

    public static double CalcularSalario(double Salario, int Bonus, double Desconto) {

        double Total = Salario +((Salario*Bonus)/100);
        Total -= Desconto;
        return Total;
    }
}