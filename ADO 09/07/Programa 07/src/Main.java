import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int A = input.nextInt();

        double[] Notas = CriarArray(A,input);

        double Media = CalcularMedia(Notas);
        double Maior = MaiorNota(Notas);
        double Menor = MenorNota(Notas);

        System.out.println("A media das notas é : "+Media);
        System.out.println("A maior Nota é : "+Maior);
        System.out.println("A menor Nota é : "+Menor);

        MostrarTela(Notas);


    }

    public static double[] CriarArray(int A, Scanner input) {

        double[] Notas = new double[A];

        for(int C = 0; C < Notas.length ; C++) {

            System.out.println("Digite uma nota: ");
            Notas[C] = input.nextDouble();
        }

        return Notas;
    }

    public static double CalcularMedia(double[] Notas) {

        double Media = 0.0;

        for(int C = 0; C < Notas.length ; C++) {
          Media += Notas[C];
        }
        Media = Media/Notas.length;
        return Media;
    }

    public static double MaiorNota(double[] Notas) {

        double Maior = 0.0;

        for(int C = 1 ; C < Notas.length; C++) {

            if(Notas[C-1] >= Notas[C] && Notas[C-1] >= Maior ) {
                Maior = Notas[C-1];
            }
        }
        return Maior;
    }

    public static double MenorNota(double[] Notas) {

        double Menor = 10.0;

        for(int C = 1 ; C < Notas.length ; C++) {

            if (Notas[C-1] <= Notas[C] && Notas[C-1] <= Menor) {
                Menor = Notas[C-1];
            }
        }
        return Menor;
    }

    public static void MostrarTela(double[] Notas) {

        System.out.println("============================\n");
        System.out.println("NOTAS DIGITADAS: ");

        for(int C = 0 ; C < Notas.length ; C++) {

            if(C == Notas.length-1) {
                System.out.print(Notas[C]);
            }else {
                System.out.print(Notas[C]+"-");
            }

        }
    }
}