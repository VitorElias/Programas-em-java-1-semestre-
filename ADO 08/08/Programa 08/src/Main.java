import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String Frase = new String(input.nextLine());

        String F = Separar(Frase);

        System.out.println(F);


    }
    public static String Separar(String Frase) {

        Frase = Frase.toUpperCase();
        String F = new String();

        for(int C = 0; C < Frase.length(); C++) {

            if(Frase.charAt(C) == ' ') {
                continue;
            }else {
                if(C == Frase.length()-1) {
                    F += Frase.charAt(C)+"";
                }else {
                    F += Frase.charAt(C) + "-";
                }
            }
        }

        return F;
    }
}