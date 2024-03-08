import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Digite uma frase:");
       String Frase = new String(input.nextLine());

       MostrarTela(Frase);

    }
    public static void MostrarTela(String Frase) {
         char A = ' ';
         int C = 0;
         int R = 0;

       while(C < Frase.length()){
            A = Frase.charAt(C);

            if(A != ' ') {
               System.out.println("Letra "+(R+1)+" = "+A);
               C++;
               R++;

            }else {

                System.out.println("ESPAÇO");
                C++;
                continue;


            }

        }

    }
}