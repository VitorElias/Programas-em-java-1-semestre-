import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite qual o numero a ser mostrado sua tabuada:");
        int X = input.nextInt();

        MostrarTela(X);

        }
        public static void MostrarTela(int X) {
         int C = 1;

         while(C <= 10) {

             System.out.println(X+" X "+C+" = "+(X*C));
             C++;
         }
        }
}