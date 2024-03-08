import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double N1 = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        double N2 = input.nextDouble();

        System.out.println("Digite a terceira nota:");
        double N3 = input.nextDouble();

        double Media = CalcularMedia(N1,N2,N3);
        boolean Passou = VerificarSePassou(Media);

        System.out.println("A media do aluno é "+Media);
        System.out.println("O aluno passou? "+Passou);


    }

    public static double CalcularMedia(double N1,double N2 , double N3) {

        double Media = (N1+N2+N3)/3.0;
        return Media;
    }

    public static boolean VerificarSePassou(double Media) {

        boolean Passou = Media >= 6.0;
        return Passou;
    }
}