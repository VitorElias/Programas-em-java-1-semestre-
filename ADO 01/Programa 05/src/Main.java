import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        int L = input.nextInt();

        int Area = CalcularArea(L);

        System.out.println("==================\n");
        System.out.printf("A area do quadrado é %d",Area);

    }

    public static int CalcularArea(int L) {
        int Total = L*L;
        return Total;
    }
}