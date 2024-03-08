import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do livro:");
        String Nome = input.nextLine();

        System.out.println("Digite quantas paginas o livro tem:");
        double QuantPag = input.nextDouble();

        System.out.println("Digite quanto tempo voce leva para ler uma pagina(EM SEGUNDOS):");
        double Segundos = input.nextDouble();

        double Temp = CalcularTempo(QuantPag, Segundos);

        System.out.println("Voce lerá "+Nome+" em "+Temp+" Horas");



    }

    public static double CalcularTempo(double Q , double S) {

        double Tempo = ((Q*S)/60)/60;
        return Tempo;
    }

}