import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====PRIMEIRO==RETÂNGULOS=====\n");

        System.out.println("Digite a base do primeiro retangulo:");
        int B = input.nextInt();

        System.out.println("Digite a altura do primeiro retangulo:");
        int A = input.nextInt();

        int Area1 = CalcularArea(B, A);

        System.out.println("=====SEGUNDO==RETÂNGULO=====\n");

        System.out.println("Digite a base do segundo retangulo:");
        B = input.nextInt();

        System.out.println("Digite a altura do segundo retangulo:");
        A = input.nextInt();

        int Area2 = CalcularArea(B,A);
        boolean Iguais = CompararArea(Area1,Area2);

        System.out.println("A area do primeiro retangulo:"+Area1);
        System.out.println("A area do segundo retangulo: "+Area2);
        System.out.println("Os retangulos são iguais? "+Iguais);




    }
    public static int CalcularArea(int B , int A) {

        int Area = B*A;
        return Area;
    }

    public static boolean CompararArea(int Area1 , int Area2) {

        boolean iguais = Area1 == Area2;
        return iguais;
    }
}