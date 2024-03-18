import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Nota1 = PedirNota(input);
        double Nota2 = PedirNota(input);
        double Nota3 = PedirNota(input);

        double Media = CalcularMedia(Nota1,Nota2,Nota3);

        System.out.println("A media do aluno é "+Media);


    }

    public static double PedirNota(Scanner input) {
        double N1 = 0.0;
        boolean NotaCerta = true;


        do {
           System.out.println("Digite uma nota:");
           N1 = input.nextDouble();

           if(N1 >= 0.0 && N1 <= 10.0) {
               NotaCerta = false;
           }else {
               System.out.println("NOTA INVALIDA, ELA DEVE ESTAR ENTRE  0 E 10\n\n");
               continue;
           }

        }while(NotaCerta);

        return N1;
    }

    public static double CalcularMedia(double N1, double N2 ,double N3) {

        double Media = (N1+N2+N3)/3;

        return Media;
    }
}